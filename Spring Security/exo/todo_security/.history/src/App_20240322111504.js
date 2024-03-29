import logo from './logo.svg';
import './App.css';
import { Router } from 'react-router-dom';

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
        <ProtectedRoute>
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
