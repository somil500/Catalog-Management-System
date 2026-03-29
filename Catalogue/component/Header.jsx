import React from "react";
import "./Header.css";

function Header() {
  return (
    <header className="header">
      <img
        src="https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg"
        alt="Logo"
        className="logo"
      />
      <h1 className="title">Product Catalogue</h1>
    </header>
  );
}

export default Header;
