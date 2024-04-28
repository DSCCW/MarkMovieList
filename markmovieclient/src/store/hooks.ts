import { TypedUseSelectorHook, useDispatch, useSelector } from 'react-redux'
import type { State, AppDispatch } from '.'
import type { State as PSState } from './MovieList'

export const useAppDispatch: () => AppDispatch = useDispatch
export const useAppSelector: TypedUseSelectorHook<State> = useSelector

export const useMLSelector: TypedUseSelectorHook<PSState> = 
    <T>(f:(state:PSState) => T) => useAppSelector((state:State) => f(state.movieList))
    

