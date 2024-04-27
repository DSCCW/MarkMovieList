import React from 'react';
import logo from './logo.svg';
import './App.css';
import movieList from '../components/movieList';

function MovieListComponent() {
  return movieList();
}

function App() {
  return (
    <div className="MovieList">
      Movie Ranking
      <MovieListComponent/>
    </div>
  );
}

export default App;
