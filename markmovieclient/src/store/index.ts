import { configureStore } from '@reduxjs/toolkit';
import movieListReducer from './MovieList'

export const store = configureStore({
    reducer: {
        movieList: movieListReducer
    },
    middleware: (getDefaultMiddleware) => getDefaultMiddleware({serializableCheck:false}),
});

export type State = ReturnType<typeof store.getState>
export type AppDispatch = typeof store.dispatch