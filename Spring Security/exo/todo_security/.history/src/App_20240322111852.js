import logo from './logo.svg';
import './App.css';
import { Route, Router, Routes } from 'react-router-dom';
import Header from './shared/header';
import ProtectedRoute from './helpers/ProtectedRoute';
import TodoList from './components/TodoList';
import Login from './components/Login';

function App() {
  return (
    <Router>
    <Header />
    <Routes>
      <Route path="/login" element={<Login />} />
      <Route path="/register" element={<Reg />} />
      <Route path="/" element={<Login />} />

      {/* Protéger la route /products */}
      <Route path="/products" element={
        <ProtectedRoute>
          <TodoList />
        </ProtectedRoute>
      } />

      {/* Protéger la route /create-product */}
      <Route path="/create-product" element={
        <ProtectedRoute>
          <CreateToDo/>
        </ProtectedRoute>
      } />
    </Routes>
  </Router>
  );
}

export default App;
