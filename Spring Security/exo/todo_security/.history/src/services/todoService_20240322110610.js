import api from './api';
import { authHeader } from '../helpers/auth-header';

const getAllTodos = () => {
  return api.get('/products', { headers: authHeader() });
};


const createTodo = (product) => {
  return api.post('/products/admin/post', product, { headers: authHeader() });
};


const deleteTodo = (productId) => {
  return api.delete(`/products/${productId}`, { headers: authHeader() });
};

const updateTodo = (productData) => {
  console.log(productData)
  return api.put('/products/admin/update', productData, {
    headers: {
      ...authHeader(),
      'Content-Type': 'application/json'
    }
  });
};

export const todoService = { getAllTodos, createTodo, deleteTodo, updateTodo };
