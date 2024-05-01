import React, { useEffect, useState } from "react";
import { Typography } from "@mui/material";
import InfiniteScroll from "react-infinite-scroll-component";
import { MovieDTO } from "../movielistapi";
import { useAppDispatch, useMLSelector } from "../store/hooks";
import { getMovies, getTop10MoviesByRevenue, setSelected } from "../store/MovieList";
import GenerateModal from "./movieDetail";
import { Modal } from "react-bootstrap";
import DefaultMovieList from "./defaultMovieList";


const MovieList = ({showModal, setShowModal} : {showModal: boolean, setShowModal: React.Dispatch<React.SetStateAction<boolean>>}) => {

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

    const GenerateModalDetails = ({movie} : {movie : MovieDTO}) => {
        return (
            <Modal
                show={showModal}
                onHide={() => {
                    dispatch(setSelected(undefined))
                    setShowModal(false)
                }}
                fullscreen="md"
                size="lg"
            >

                <Modal.Header closeButton style={{marginLeft:"20px", marginRight:"20px"}}>
                    <Modal.Title>
                        <Typography variant="h5" style={{color:"darkslategray", fontSize:"32px"}}>{movie.movieTitle}</Typography>
                    </Modal.Title>
                </Modal.Header>

                <Modal.Body style={{marginLeft:"20px", marginRight:"20px"}}>
                    <GenerateModal movie={movie}/>
                </Modal.Body>
                

            </Modal>
        )
    }
    
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
        {state.selected !== undefined 
            && <GenerateModalDetails movie={state.selected}/>}
    </>
        
}

export default MovieList;