import React from 'react';
import './ProductList.css';

function ProductList({ products, logo }) {
  return (
    <div className="product-grid">
      {products.map(product => (
        <div key={product.id} className="product-card">
          <img 
            src={product.image_url || logo} 
            alt={product.name} 
            className="product-image"
          />
          <h3>{product.name}</h3>
          <p>{product.discription}</p>
          <p className="product-price">₹{product.price}</p>
        </div>
      ))}
    </div>
  );
}

export default ProductList;
