import api from './api';
import { authHeader } from '../helpers/auth-header';

const getAllTodos = () => {
  return api.get('/todos', { headers: authHeader() });
};


const createTodo = (todo) => {
  return api.post('/todos/admin/post', todo, { headers: authHeader() });
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
