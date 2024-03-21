import { useEffect, useState } from "react";

import 'bootstrap/dist/css/bootstrap.min.css';



function ProductForm({ onSubmit }) {
    const [name, setName] = useState('');
    const [price, setPrice] = useState('');
  
    const handleSubmit = (e) => {
      e.preventDefault();
      onSubmit({ name, price });
      setName('');
      setPrice('');
    };
    return (
    <div className="container mt-5">
      <h2>Add From</h2>
      
        <div className="mb-3">
          <label htmlFor="name" className="form-label">Name</label>
          <input
            type="text"
            className="form-control"
            id="name"
            name="name"
            value={userData.name}
            onChange={handleChange}
            required
          />
    </div>
        <div className="mb-3">
          <label htmlFor="email" className="form-label">Email</label>
          <input
            type="email"
            className="form-control"
            id="email"
            name="email"
            value={userData.email}
            onChange={handleChange}
            required
          />
        </div>
  
        <button type="submit" className="btn btn-primary">Add</button>
     
    );

};
export default ProductForm;