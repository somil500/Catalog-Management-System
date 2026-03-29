import React, { useEffect, useState } from "react";
import axios from "axios";
import "./CategoryList.css";

function CategoryList({ onSelectCategory }) {
  const [categories, setCategories] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/api/categories")
      .then(response => setCategories(response.data))
      .catch(error => console.error("Error fetching categories:", error));
  }, []);

  return (
    <div className="category-row">
      {categories.map((cat) => (
        <button 
          key={cat.id} 
          className="category-btn"
          onClick={() => onSelectCategory(cat.id)}
        >
          {cat.name}
        </button>
      ))}
    </div>
  );
}

export default CategoryList;
