document.addEventListener("DOMContentLoaded", () => {
  const loginForm = document.getElementById("login-form");
  const signupForm = document.getElementById("signup-form");
  const loginMsg = document.getElementById("login-message-container");
  const signupMsg = document.getElementById("signup-message-container");

  window.switchForm = (form) => {
    loginForm.classList.toggle("active", form === "login");
    signupForm.classList.toggle("active", form === "signup");
    loginMsg.textContent = signupMsg.textContent = "";
  };

  const getUsers = () => JSON.parse(localStorage.getItem("users") || "[]");
  const saveUsers = (u) => localStorage.setItem("users", JSON.stringify(u));

  signupForm.addEventListener("submit", e => {
    e.preventDefault();
    const email = signupForm["signup-email"].value.trim();
    const pw = signupForm["signup-password"].value;
    const cpw = signupForm["signup-confirm-password"].value;

    if (pw !== cpw) {
      signupMsg.textContent = "Passwords do not match.";
      signupMsg.className = "message-container error";
      return;
    }
    const users = getUsers();
    if (users.find(u => u.email === email)) {
      signupMsg.textContent = "Email already registered.";
      signupMsg.className = "message-container error";
      return;
    }
    users.push({ email, password: pw });
    saveUsers(users);
    signupMsg.textContent = "Signup successful—please log in.";
    signupMsg.className = "message-container success";
    signupForm.reset();
    switchForm("login");
  });

  loginForm.addEventListener("submit", e => {
    e.preventDefault();
    const email = loginForm["login-email"].value.trim();
    const pw = loginForm["login-password"].value;
    const users = getUsers();
    const me = users.find(u => u.email === email && u.password === pw);

    if (!me) {
      loginMsg.textContent = "Invalid email or password.";
      loginMsg.className = "message-container error";
      return;
    }
    
    localStorage.setItem("currentUser", JSON.stringify({ email: me.email }));
    window.location.href = "index.html";
  });
});
