import React from "react";
import "./ProductCard.css";

function ProductCard({ product }) {
  return (
    <div className="product-card">
      <img src={product.image_url} alt={product.name} className="product-img" />
      <h3>{product.name}</h3>
      <p>{product.discription}</p>
      <strong>₹{product.price}</strong>
      <button className="buy-btn">Buy Now</button>
    </div>
  );
}

export default ProductCard;
