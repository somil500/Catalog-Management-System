import React, { useEffect, useState } from "react";
import axios from "axios";
import ProductCard from "./ProductCard";
import "./ProductGrid.css";

function ProductGrid({ categoryId }) {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    const url = categoryId 
      ? `http://localhost:8080/api/product/${categoryId}` 
      : `http://localhost:8080/api/product`;

    axios.get(url)
      .then(response => setProducts(response.data))
      .catch(error => console.error("Error fetching products:", error));
  }, [categoryId]);

  return (
    <div className="product-grid">
      {products.map((product) => (
        <ProductCard key={product.id} product={product} />
      ))}
    </div>
  );
}

export default ProductGrid;
