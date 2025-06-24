const PRODUCT_URL = "https://dummyjson.com/products?limit=84";
const imagesBox = document.querySelector(".images-box");
const searchBar = document.querySelector(".search-bar input");

const fetchProducts = async (url) => {
  try {
    const response = await fetch(url);
    const data = await response.json();
    displayProducts(data.products);
  } catch (error) {
    console.log("Error fetching products:", error);
  }
};

fetchProducts(PRODUCT_URL);

const displayProducts = (products) => {
  imagesBox.innerHTML = "";

  products.forEach((product) => {
    const { thumbnail, category, price, discountPercentage, rating } = product;

    const productCard = document.createElement("div");
    productCard.classList.add("product-card");

    const img = document.createElement("img");
    img.src = thumbnail;
    img.alt = `Product image for ${category}`;
    img.onerror = () => {
      img.src = "https://via.placeholder.com/200";
      img.alt = "Image not available";
    };

    productCard.innerHTML = `
      <div class="cart-icon-img"><ion-icon name="cart-outline"></ion-icon></div>
      ${img.outerHTML}
      <div class="categoryAndPrice">
        <p>${category}</p>
        <span>$${price}</span>
      </div>
      <div class="product-rating">
        <span>⭐⭐⭐ ${rating}</span>
        <span class="discount">-${Math.round(discountPercentage)}%</span>
      </div>
    `;

    imagesBox.appendChild(productCard);
  });
};

imagesBox.addEventListener("click", (e) => {
  if (e.target.closest(".cart-icon-img")) {
    alert("🛒 Product added to cart!");
  }
});

searchBar.addEventListener("input", (event) => {
  event.preventDefault(); 
  const searchTerm = event.target.value.toLowerCase();
  const productCards = imagesBox.querySelectorAll(".product-card");

  productCards.forEach((card) => {
    const category = card.querySelector(".categoryAndPrice p").textContent.toLowerCase();
    if (category.includes(searchTerm)) {
      card.style.display = "block";
    } else {
      card.style.display = "none";
    }
  });
});