import React, { useState, useEffect } from 'react';
import api from '../services/api';
import { authHeader } from '../helpers/auth-header';

const ProductForm = () => {
  const [productData, setProductData] = useState({
    name: '',
    price: 0,
  });
  const [isCreated, setIsCreated] = useState(false);
  const [errorMessage, setErrorMessage] = useState('');

  const handleChange = (e) => {
    const { name, value } = e.target;
    setProductData({ ...productData, [name]: value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      // Envoyer les données du produit à l'API
      const response = await api.post('/products/admin/post', productData, { headers: authHeader() });
      const newProduct = response.data;

      // Mettre à jour l'état avec le nouveau produit (si pertinent)
      setProductData(newProduct);

      setIsCreated(true);
    } catch (error) {
      console.error('Error creating product:', error);
      setErrorMessage(error.message);
    }
  };

  useEffect(() => {
    if (isCreated) {
      // Afficher le modal
      // ... code pour afficher le modal

      // Réinitialiser le statut de création et le message d'erreur après un certain temps
      setTimeout(() => {
        setIsCreated(false);
        setErrorMessage('');
      }, 2000);
    }
  }, [isCreated]);

  return (
    <div className="container">
      <h2>Ajouter un produit</h2>
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label htmlFor="name">Nom du produit:</label>
          <input 
            type="text" 
            className="form-control" 
            id="name"
            name="name"
            value={productData.name} 
            onChange={handleChange} 
          />
        </div>
        <div className="mb-3">
          <label htmlFor="price">Prix:</label>
          <input 
            type="number" 
            className="form-control" 
            id="price"
            name="price"
            value={productData.price} 
            onChange={handleChange} 
          />
        </div>
        <button type="submit" className="btn btn-primary">Ajouter</button>
      </form>

     
    </div>
  );
};

export default ProductForm;
