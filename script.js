const PRODUCT_URL = "https://dummyjson.com/products?limit=84";
const imagesBox = document.querySelector(".images-box");
const searchBar = document.querySelector(".search-bar input");
const cartCountSpan = document.querySelector(".cart-box .count");
const loginLink = document.getElementById("login-link");
const userInfo = document.getElementById("user-info");
const emailDisp = document.querySelector(".user-email-display");
const logoutBtn = document.getElementById("logout-btn");

let cartCount = 0;

const currentUser = JSON.parse(localStorage.getItem("currentUser"));

if (currentUser?.email) {
  loginLink.style.display = "none";
  userInfo.style.display = "flex";
  emailDisp.textContent = currentUser.email;
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
  products.forEach(({ thumbnail, category, price, discountPercentage, rating }) => {
    const card = document.createElement("div");
    card.className = "product-card";
    card.innerHTML = `
      <div class="cart-icon-img"><ion-icon name="cart-outline"></ion-icon></div>
      <img src="${thumbnail}" alt="Product: ${category}" onerror="this.src='https://via.placeholder.com/200';" />
      <div class="categoryAndPrice">
        <p>${category}</p>
        <span>$${price}</span>
      </div>
      <div class="product-rating">
        <span>⭐⭐⭐ ${rating}</span>
        <span class="discount">-${Math.round(discountPercentage)}%</span>
      </div>`;
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
    const cat = card.querySelector(".categoryAndPrice p").textContent.toLowerCase();
    card.style.display = cat.includes(term) ? "block" : "none";
  });
});
