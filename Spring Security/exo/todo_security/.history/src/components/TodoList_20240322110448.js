import React, { useEffect, useState } from 'react';

import UpdateTodoModal from './UpdateTodoModal';


function TodoList() {
  const [todos, setTodos] = useState([]);
  const [error, setError] = useState('');

  useEffect(() => {
    .getAllTodos()
      .then(response => {
        console.log(response)
        setTodos(response.data);
      })
      .catch(error => {
        setError('Erreur lors de la récupération des produits.');
      });
  }, []);

  const loadTodos = () => {
    productService.getAllTodos()
      .then(response => {
        setTodos(response.data);
      })
      .catch(error => {
        setError('Erreur lors de la récupération des produits.');
      });
  };

  const [selectedTodo, setSelectedTodo] = useState(null);

  const updateTodo = (productData) => {
    console.log("product " + productData.name)
    productService.updateTodo(productData)
      .then(() => {
        loadTodos();
        setSelectedTodo(null);
      })
      .catch(error => {
        setError('Erreur lors de la mise à jour du produit.');
      });
  };


  const deleteTodo = (productId) => {
    productService.deleteTodo(productId)
      .then(() => {
        loadTodos();
      })
      .catch(error => {
        setError('Erreur lors de la suppression du produit.');
      });
  };


  return (
    <div className="container mt-5">
      <h2>Todo List</h2>
      {error && <div className="alert alert-danger" role="alert">
        {error}
      </div>}
      <table className="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col" className='center'>Actions</th>

          </tr>
        </thead>
        <tbody>
          {todos.map((product, index) => (
            <tr key={product.id}>
              <th scope="row">{index + 1}</th>
              <td>{product.name}</td>
              <td>{product.price}</td>
              <td>
                <button className="btn btn-danger mr-4" onClick={() => deleteTodo(product.id)}>Supprimer</button>
                <button className='btn btn-warning' onClick={() => setSelectedTodo(product)}>Update</button>
               
              </td>
            </tr>
          ))}
           {selectedTodo && (
                  <UpdateTodoModal
                    product={selectedTodo}
                    onSave={updateTodo}
                    onCancel={() => setSelectedTodo(null)}
                  />
                )}
        </tbody>
      </table>

    </div>
  );
}

export default TodoList;
