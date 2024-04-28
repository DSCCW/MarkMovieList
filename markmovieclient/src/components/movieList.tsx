import React, { useState } from "react";
import { Table } from "@mui/material";
import TableContainer from "@mui/material/TableContainer";
import TableHead from "@mui/material/TableHead";
import TableRow from "@mui/material/TableRow";
import TableCell from "@mui/material/TableCell";
import TableBody from "@mui/material/TableBody";
import IconButton from "@mui/material/IconButton";
import InfiniteScroll from "react-infinite-scroll-component";
import { MovieDTO } from "../movielistapi";
import { useMLSelector } from "../store/hooks";




const DefaultMovieList = ({rows} : {rows: MovieDTO[]}) => {
    return (
            <TableContainer>
                <Table>
                    <TableHead>
                        <TableRow>
                            <TableCell>Ranking</TableCell>
                            <TableCell align="right">Title</TableCell>
                            <TableCell align="right">Year</TableCell>
                            <TableCell align="right">Revenue</TableCell>
                            <TableCell align="right"></TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {
                            rows.map((row, index) => (
                                <TableRow>
                                    <TableCell>{index}</TableCell>
                                    <TableCell align="right">{row.movieTitle}</TableCell>
                                    <TableCell align="right">{row.releaseYear}</TableCell>
                                    <TableCell align="right">{row.revenue}</TableCell>
                                    <TableCell align="right">
                                        <IconButton onClick={() => {/* TODO */}}></IconButton>
                                    </TableCell>
                                </TableRow>
                            ))
                        }
                    </TableBody>
                </Table>
            </TableContainer>
    )
}


const movieList = () => {

    const state = useMLSelector(state => state)
    const [page, setPage] = useState(1)
    const movieListSliced = state.movieList?.slice(0, page * 10)

    const incrementPage = () => {
        setPage(page + 1)
    };  

    
    return (
        <InfiniteScroll
            dataLength={movieListSliced!.length}
            next={incrementPage}
            hasMore={movieListSliced!.length < state.movieList!.length}
            loader={""}
        >
            {
                movieListSliced != undefined
                && <DefaultMovieList rows={movieListSliced}/>
            }

        </InfiniteScroll>
        
    )
        
}

export default movieList;