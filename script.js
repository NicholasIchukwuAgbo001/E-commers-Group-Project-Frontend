const PRODUCT_URL = "https://dummyjson.com/products?limit=84";
const imagesBox = document.querySelector(".images-box");
const searchBar = document.querySelector(".search-bar input");
const cartCountSpan = document.querySelector(".cart-box .count");
const loginLink = document.getElementById("login-link");
const userInfo = document.getElementById("user-info");
const nameDisp = document.querySelector(".user-name-display");
const logoutBtn = document.getElementById("logout-btn");

let cartCount = 0;

const currentUser = JSON.parse(localStorage.getItem("currentUser"));

if (currentUser?.email) {
  loginLink.style.display = "none";
  userInfo.style.display = "flex";
  nameDisp.textContent = currentUser.name;
} else {
  loginLink.style.display = "flex";
  userInfo.style.display = "none";
}

logoutBtn.addEventListener("click", () => {
  localStorage.removeItem("currentUser");
  location.reload();
});

async function fetchProducts(url) {
  try {
    const res = await fetch(url);
    const { products } = await res.json();
    displayProducts(products);
  } catch (err) {
    console.error("Fetch error:", err);
  }
}
fetchProducts(PRODUCT_URL);


function displayProducts(products) {
  imagesBox.innerHTML = "";
  products.forEach(({ title, thumbnail, category, price, discountPercentage, rating }) => {
    const card = document.createElement("div");
    card.className = "product-card";
    card.innerHTML = `
      <div class="cart-icon-img"><ion-icon class="cart-icon-inner" name="cart-outline"></ion-icon></div>
      <img src="${thumbnail}" alt="Product: ${category}" onerror="this.src='https://via.placeholder.com/200';" />
      <h3 class="product-name">${title}</h3>
      <div class="categoryAndPrice">
        <p>${category}</p>
        <span>$${price}</span>
      </div>
      <div class="product-rating">
        <span>⭐⭐⭐ ${rating}</span>
        <span class="discount">-${Math.round(discountPercentage)}%</span>
      </div>
    `;
    imagesBox.appendChild(card);
  });
}

imagesBox.addEventListener("click", e => {
  if (e.target.closest(".cart-icon-img")) {
    if (!currentUser) {
      alert("Please login to add items to cart");
      return;
    }
    alert("🛒 Added to cart!");
    cartCountSpan.textContent = ++cartCount;
  }
});

searchBar.addEventListener("input", e => {
  const term = e.target.value.toLowerCase();
  document.querySelectorAll(".product-card").forEach(card => {
    const cat = card.querySelector(".product-name").textContent.toLowerCase();
    card.style.display = cat.includes(term) ? "block" : "none";
  });
});
