import { createSlice, PayloadAction } from '@reduxjs/toolkit'
import { Configuration, MovieDTO, MovieListControllerApi } from '../movielistapi';


export interface State {
    movieList: MovieDTO[] | undefined,
    filteredMovieList: MovieDTO[] | undefined,
    selected: MovieDTO | undefined,
}

const initialState : State = {
    movieList: undefined,
    filteredMovieList: undefined,
    selected: undefined
}

export const slice = createSlice({
    name: 'movieList',
    initialState,
    reducers: {
        setMovieList: (state, action:PayloadAction<MovieDTO[] | undefined>) => {
            state.movieList = action.payload
        },

        setFilteredMovieList: (state, action:PayloadAction<MovieDTO[] | undefined>) => {
            state.filteredMovieList = action.payload
        },

        setSelected: (state, action:PayloadAction<MovieDTO | undefined>) => {
            state.selected = action.payload
        }
    }
})

export const api = new MovieListControllerApi(new Configuration(
    {
        headers: {
            'Access-Control-Allow-Origin': '*'
        },
        
    }
))

export const getMovies = () => (dispatch:any) => {
    api.getAllMovies().then(data => {
        dispatch(setMovieList(data))
    })
}

export const getTop10MoviesByRevenue = () => (dispatch:any) => {
    api.getTop10RevenueMovies().then(data => dispatch(setFilteredMovieList(data)))
}

export const getTop10MoviesByRevenueByYear = (year: number) => (dispatch:any) => {
    api.getTop10RevenueMoviesByYear({year: year}).then(data => dispatch(setFilteredMovieList(data)))
}

export const {setMovieList, setFilteredMovieList , setSelected} = slice.actions

export default slice.reducer