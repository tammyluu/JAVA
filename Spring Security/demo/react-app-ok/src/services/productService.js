import api from './api';
import { authHeader } from '../helpers/auth-header';

const getAllProducts = () => {
  return api.get('/products', { headers: authHeader() });
};

const getProductById = async (productId) => {
  try {
    const response = await api.get('/products/{id}', { headers: authHeader() });
    return response.data;
  } catch (error) {
    console.error('Error fetching product:', error);
    throw error; // Re-throw the error for handling in the calling component
  }
};


const createProduct = async (productData) => {
  try {
    const response = await api.post('/products/admin/post', productData, { headers: authHeader() });
    return response.data;
  } catch (error) {
    console.error('Error creating product:', error);
    throw error; 
  }
};

const updateProduct = async (productId, productData) => {
  try {
    const response = await api.put('/products/{id}', productData, { headers: authHeader() });
    return response.data;
  } catch (error) {
    console.error('Error updating product:', error);
    throw error; 
  }
};

const deleteProduct = async (productId) => {
  try {
    await api.delete('/products/{id}', { headers: authHeader() });
    return { message: 'Produit supprimé avec succès' };
  } catch (error) {
    console.error('Error deleting product:', error);
    throw error; 
  }
};

export const productService = { getAllProducts, getProductById,createProduct ,updateProduct,deleteProduct};   