import { TypedUseSelectorHook, useDispatch, useSelector } from 'react-redux'
import type { State, AppDispatch } from '.'
import type { State as MLState } from './MovieList'

export const useAppDispatch: () => AppDispatch = useDispatch
export const useAppSelector: TypedUseSelectorHook<State> = useSelector

export const useMLSelector: TypedUseSelectorHook<MLState> = 
    <T>(f:(state:MLState) => T) => useAppSelector((state:State) => f(state.movieList))
    

