import React, { useEffect, useState } from "react";
import { Card, Paper, Table, Typography } from "@mui/material";
import TableContainer from "@mui/material/TableContainer";
import TableHead from "@mui/material/TableHead";
import TableRow from "@mui/material/TableRow";
import TableCell from "@mui/material/TableCell";
import TableBody from "@mui/material/TableBody";
import IconButton from "@mui/material/IconButton";
import InfiniteScroll from "react-infinite-scroll-component";
import { MovieDTO } from "../movielistapi";
import { useAppDispatch, useMLSelector } from "../store/hooks";
import { getMovies, setSelected } from "../store/MovieList";
import GenerateModal from "./movieDetail";
import { Visibility } from "@mui/icons-material";
import { Modal } from "react-bootstrap";


const MovieList = () => {

    const dispatch = useAppDispatch()
    const state = useMLSelector(state => state)

    useEffect(() => {
            dispatch(getMovies())
    }, [])

    const [size, setSize] = useState(10)
    const movieListSliced = state.movieList?.slice(0, size)
    const [showModal, setShowModal] = useState(true)

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

    const DefaultMovieList = ({rows} : {rows: MovieDTO[]}) => {
        
        return (
            <div>
                <TableContainer style={{}} component={Paper}>
                    <Table stickyHeader>
                        <TableHead>
                            Movie Ranking
                            <TableRow>
                                <TableCell>Ranking</TableCell>
                                <TableCell>Title</TableCell>
                                <TableCell>Year</TableCell>
                                <TableCell>Revenue</TableCell>
                                <TableCell></TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {
                                rows.map((row, index) => (
                                    <TableRow>
                                        <TableCell>{index}</TableCell>
                                        <TableCell>{row.movieTitle}</TableCell>
                                        <TableCell>{row.releaseYear}</TableCell>
                                        <TableCell>${row.revenue?.toLocaleString()}</TableCell>
                                        <TableCell>
                                            <IconButton>
                                                <Visibility onClick={() => {
                                                    dispatch(setSelected(row))
                                                    setShowModal(true)
                                                    }}/>
                                               
                                            </IconButton>
                                        </TableCell>
                                    </TableRow>
                                ))
                            }
                        </TableBody>
                    </Table>
                </TableContainer>
            </div>
        )
    }

    
    return <>
        {
            movieListSliced != undefined
            && <InfiniteScroll
                    dataLength={movieListSliced!.length}
                    next={incrementPage}
                    hasMore={movieListSliced!.length < state.movieList!.length}
                    loader={""}
                    height={'85vh'}
                    style={{}}
                >
                    <DefaultMovieList rows={movieListSliced}/>
                </InfiniteScroll>
            
        }
        {state.selected != undefined 
            && <GenerateModalDetails movie={state.selected}/>}
    </>
        
}

export default MovieList;