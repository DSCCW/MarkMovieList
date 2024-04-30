import React, { useEffect } from 'react';
import logo from './logo.svg';
import './App.css';
import movieList from './components/movieList';
import 'bootstrap/dist/css/bootstrap.min.css';

function MovieListComponent() {
  return movieList();
}

function App() {
  return (
    <div className="MovieList">
      <MovieListComponent/>
    </div>
  );
}

export default App;
