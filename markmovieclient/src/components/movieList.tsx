import React, { useEffect, useState } from "react";
import InfiniteScroll from "react-infinite-scroll-component";
import { useAppDispatch, useMLSelector } from "../store/hooks";
import { getMovies, getTop10MoviesByRevenue, setSelected } from "../store/MovieList";
import DefaultMovieList from "./defaultMovieList";


const MovieList = ({setShowModal} : {setShowModal: React.Dispatch<React.SetStateAction<boolean>>}) => {

    const dispatch = useAppDispatch()
    const state = useMLSelector(state => state)

    useEffect(() => {
            dispatch(getMovies())
            dispatch(getTop10MoviesByRevenue())
    }, [])

    const [size, setSize] = useState(10)
    const movieListSliced = state.movieList?.slice(0, size)

    const incrementPage = () => {
        setTimeout(() => {
            setSize(size + 5)
        }, 250)
    };
    
    return <>
        
        {
            
            movieListSliced !== undefined
            && <InfiniteScroll
                    dataLength={movieListSliced!.length}
                    next={incrementPage}
                    hasMore={movieListSliced!.length < state.movieList!.length}
                    loader={""}
                    height={'85vh'}
                >
                    <DefaultMovieList rows={movieListSliced} setShowModal={setShowModal}/>
                </InfiniteScroll>
            
        }
    </>
        
}

export default MovieList;