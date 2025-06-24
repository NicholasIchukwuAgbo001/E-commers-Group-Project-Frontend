const BACKEND_URL = "http://localhost:1111";

const loginForm = document.getElementById("login-form");
const signupForm = document.getElementById("signup-form");
const loginMsg = document.getElementById("login-message-container");
const signupMsg = document.getElementById("signup-message-container");

window.switchForm = (form) => {
  loginForm.classList.toggle("active", form === "login");
  signupForm.classList.toggle("active", form === "signup");
  loginMsg.textContent = signupMsg.textContent = "";
};

function showMessage(msgEl, message, type = "error") {
  msgEl.textContent = message;
  msgEl.className = `message-container ${type}`;
  setTimeout(() => {
    msgEl.textContent = "";
    msgEl.className = "message-container";
  }, 5000);
}

function validateEmail(email) {
  return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
}

function validatePassword(password) {
  return password.length >= 4 && password.length <= 16;
}

async function signup(e) {
  e.preventDefault();

  const name = signupForm["signup-name"]?.value.trim();
  const email = signupForm["signup-email"]?.value.trim();
  const password = signupForm["signup-password"]?.value.trim();
  const confirmPassword = signupForm["signup-confirm-password"]?.value.trim();

  if (!name) return showMessage(signupMsg, "Name is required.");
  if (!email) return showMessage(signupMsg, "Email is required.");
  if (!validateEmail(email)) return showMessage(signupMsg, "Invalid email format.");
  if (!password) return showMessage(signupMsg, "Password is required.");
  if (!validatePassword(password)) return showMessage(signupMsg, "Password must be 4-16 characters.");
  if (!confirmPassword) return showMessage(signupMsg, "Please confirm your password.");
  if (password !== confirmPassword) return showMessage(signupMsg, "Passwords do not match.");

  try {
    const response = await fetch(`${BACKEND_URL}/api/users/register`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ name, email, password }),
    });

    const text = await response.text();
    const data = text ? JSON.parse(text) : {};

    if (response.ok && data.success) {
      showMessage(signupMsg, "Signup successful—please log in.", "success");
      signupForm.reset();
      switchForm("login");
    } else {
      // Handle specific backend errors
      if (response.status === 409) {
        showMessage(signupMsg, "This email is already in use. Please use a different one.");
      } else if (response.status === 400) {
        showMessage(signupMsg, data.message || "Invalid input. Please review your information.");
      } else {
        showMessage(signupMsg, data.message || "Signup failed. Please try again.");
      }
    }
  } catch (err) {
    showMessage(signupMsg, "Signup error: " + err.message);
  }
}


async function login(e) {
  e.preventDefault();

  const email = loginForm["login-email"]?.value.trim();
  const password = loginForm["login-password"]?.value.trim();

  if (!email) return showMessage(loginMsg, "Email is required.");
  if (!validateEmail(email)) return showMessage(loginMsg, "Invalid email format.");
  if (!password) return showMessage(loginMsg, "Password is required.");
  if (!validatePassword(password)) return showMessage(loginMsg, "Password must be 4-16 characters.");

  try {
    const response = await fetch(`${BACKEND_URL}/api/users/login`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ email, password }),
    });

    const text = await response.text();
    const data = text ? JSON.parse(text) : {};

    if (response.ok && data.success) {
      const { id, name, email } = data.data;
      localStorage.setItem("currentUser", JSON.stringify({ id, name, email }));
      window.location.href = "index.html";
    } else {
      const errorMessage =
        data.message || data.data || "Invalid email or password.";
      showMessage(loginMsg, errorMessage);
    }
  } catch (err) {
    showMessage(loginMsg, "Login error: " + err.message);
  }
}

signupForm.addEventListener("submit", signup);
loginForm.addEventListener("submit", login);
