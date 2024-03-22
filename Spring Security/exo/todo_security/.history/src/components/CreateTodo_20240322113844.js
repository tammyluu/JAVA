import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { todoService } from '../services/todoService';


const CreateTodo = () => {
    const [todo, setTodo] = useState({
        title: '',
        description: '',
        isCompleted: false
    });
    const navigate = useNavigate();

    const handleChange = (e) => {
        const { name, value } = e.target;
        setTodo(prevState => ({
            ...prevState,
            [name]: value
        }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            await todoService.createTodo(todo);
            console.log('Todo created successfully');
            // Réinitialiser le formulaire ou rediriger l'utilisateur
            setTodo({ title: '', description: '', isCompleted: false });
            navigate('/todos'); // Optionnel : redirigez l'utilisateur après succès
        } catch (error) {
            console.error('Error creating todo:', error);
            // Gérer les erreurs ici, par exemple en informant l'utilisateur
        }
    };

    // Le code JSX reste le même que dans l'exemple précédent
    return (
        <div className="container mt-5">
        <h2>Create a new todo</h2>
        <form onSubmit={handleSubmit}>
            <div className="mb-3">
                <label htmlFor="title" className="form-label">Title</label>
                <input 
                    type="text" 
                    className="form-control" 
                    id="title" 
                    name="title" 
                    value={todo.title} 
                    onChange={handleChange} 
                />
            </div>
            <div className="mb-3">
                <label htmlFor="description" className="form-label">Description</label>
                <input 
                    type="text" 
                    className="form-control" 
                    id="description" 
                    name="description" 
                    value={todo.description} 
                    onChange={handleChange} 
                />
            </div>
            <div className="mb-3">
                <label htmlFor="status" className="form-label">Description</label>
                <input 
                    type="text" 
                    className="form-control" 
                    id="status" 
                    name="status" 
                    value={todo.isCompleted} 
                    onChange={handleChange} 
                />
                 {todo.isCompleted ? <span>Yes</span> : <span>No</span>}
            </div>
            <button type="submit" className="btn btn-primary">Create</button>
        </form>
    </div>
    );
};

export default CreateTodo;
