import api from './api';
import { authHeader } from '../helpers/auth-header';

const getAllProducts = () => {
  return api.get('/products', { headers: authHeader() });
};




const saveProduct = (name, price) => { 
  return api.post('/products',{ name, price }).then((response) => {
    console.log(response.data.data)
    if (response.data.data.token) {
      localStorage.setItem('product', JSON.stringify(response.data));
      
    }
    return response.data;
  });
};

const updateProduct = (productId, productData) => {
   return api.put(`/products/${productId}`, productData, { headers: authHeader() });
 };

 const deleteProduct = (productId) => {
     return api.delete(`/products/${productId}`, { headers: authHeader() });
   };

export const productService = { getAllProducts, saveProduct,updateProduct,deleteProduct};   