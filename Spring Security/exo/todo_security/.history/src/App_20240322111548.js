import logo from './logo.svg';
import './App.css';
import { Route, Router, Routes } from 'react-router-dom';
import Header from './shared/header';

function App() {
  return (
    <Router>
    <Header />
    <Routes>
      <Route path="/login" element={<Login />} />
      <Route path="/register" element={<Register />} />
      <Route path="/" element={<Login />} />

      {/* Protéger la route /products */}
      <Route path="/products" element={
        <Prote>
          <ProductList />
        </ProtectedRoute>
      } />

      {/* Protéger la route /create-product */}
      <Route path="/create-product" element={
        <ProtectedRoute>
          <CreateProduct />
        </ProtectedRoute>
      } />
    </Routes>
  </Router>
  );
}

export default App;
