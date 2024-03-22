import logo from './logo.svg';
import './App.css';

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
        <PrivateRoute>
          <ProductList />
        </PrivateRoute>
      } />

      {/* Protéger la route /create-product */}
      <Route path="/create-product" element={
        <PrivateRoute>
          <CreateProduct />
        </PrivateRoute>
      } />
    </Routes>
  </Router>
  );
}

export default App;
