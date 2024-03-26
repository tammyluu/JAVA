
import './App.css';
import { Route, Router, Routes } from 'react-router-dom';
import Header from './shared/header';
import ProtectedRoute from './helpers/ProtectedRoute';
import TodoList from './components/TodoList';
import Login from './components/Login';
import Register from './components/Register';
import CreateTodo from './components/CreateTodo';

function App() {
  return (
    <Router>
    <Header />
    <Routes>
      <Route path="/login" element={<Login />} />
      <Route path="/register" element={<Register />} />
      <Route path="/" element={<Login />} />

      {/* Protéger la route /todos */}
      <Route path="/todos" element={
        <ProtectedRoute>
          <TodoList />
        </ProtectedRoute>
      } />

      {/* Protéger la route /create-todo */}
      <Route path="/create-todo" element={
        <ProtectedRoute>
          <CreateTodo/>
        </ProtectedRoute>
      } />
    </Routes>
  </Router>
  );
}

export default App;
