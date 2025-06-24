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

signupForm.addEventListener("submit", async (e) => {
  e.preventDefault();
  const email = signupForm["signup-email"].value.trim();
  const password = signupForm["signup-password"].value;
  const confirmPassword = signupForm["signup-confirm-password"].value;

  if (password !== confirmPassword) {
    signupMsg.textContent = "Passwords do not match.";
    signupMsg.className = "message-container error";
    return;
  }

  try {
    const response = await fetch(`${BACKEND_URL}/api/auth/signup`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ email, password }),
    });

    const data = await response.json();

    if (response.ok) {
      signupMsg.textContent = "Signup successful—please log in.";
      signupMsg.className = "message-container success";
      signupForm.reset();
      switchForm("login");
    } else {
      signupMsg.textContent = data.message || "Signup failed.";
      signupMsg.className = "message-container error";
    }
  } catch (err) {
    signupMsg.textContent = "Signup error: " + err.message;
    signupMsg.className = "message-container error";
  }
});

loginForm.addEventListener("submit", async (e) => {
  e.preventDefault();
  const email = loginForm["login-email"].value.trim();
  const password = loginForm["login-password"].value;

  if (!email || !password) {
    loginMsg.textContent = "Please enter both email and password.";
    loginMsg.className = "message-container error";
    return;
  }

  try {
    const response = await fetch(`${BACKEND_URL}/api/auth/login`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ email, password }),
    });

    const data = await response.json();

    if (response.ok && data.success) {
      localStorage.setItem("currentUser", JSON.stringify({ id: data.id, email: data.email, name: data.name }));
      window.location.href = "index.html";
    } else {
      loginMsg.textContent = data.message || "Invalid email or password.";
      loginMsg.className = "message-container error";
    }
  } catch (err) {
    loginMsg.textContent = "Login error: " + err.message;
    loginMsg.className = "message-container error";
  }
});
