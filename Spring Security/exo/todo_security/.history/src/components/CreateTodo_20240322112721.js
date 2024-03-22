import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';


const CreateTodo = () => {
    const [todo, setTodo] = useState({
        name: '',
        price: ''
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
            await productService.createTodo(product);
            console.log('Todo created successfully');
            // Réinitialiser le formulaire ou rediriger l'utilisateur
            setTodo({ name: '', price: '' });
            navigate('/products'); // Optionnel : redirigez l'utilisateur après succès
        } catch (error) {
            console.error('Error creating product:', error);
            // Gérer les erreurs ici, par exemple en informant l'utilisateur
        }
    };

    // Le code JSX reste le même que dans l'exemple précédent
    return (
        <div className="container mt-5">
        <h2>Créer un nouveau produit</h2>
        <form onSubmit={handleSubmit}>
            <div className="mb-3">
                <label htmlFor="productName" className="form-label">Nom</label>
                <input 
                    type="text" 
                    className="form-control" 
                    id="productName" 
                    name="name" 
                    value={product.name} 
                    onChange={handleChange} 
                />
            </div>
            <div className="mb-3">
                <label htmlFor="productPrice" className="form-label">Prix</label>
                <input 
                    type="number" 
                    className="form-control" 
                    id="productPrice" 
                    name="price" 
                    value={product.price} 
                    onChange={handleChange} 
                />
            </div>
            <button type="submit" className="btn btn-primary">Créer</button>
        </form>
    </div>
    );
};

export default CreateTodo;
