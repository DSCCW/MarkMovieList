
import Divider from "@mui/material/Divider";
import Typography from "@mui/material/Typography";
import Grid2 from "@mui/material/Unstable_Grid2/Grid2";
import React from "react";
import { Modal } from 'react-bootstrap'
import { MovieDTO } from "../movielistapi";


const GenerateMovieDetail = ({movie} : {movie : MovieDTO}) => {
    return (
        <Grid2>

            <Typography>{movie.movieTitle}</Typography>
            <Divider/>

            <Typography>Year</Typography>
            <Typography>{movie.releaseYear}</Typography>

            <Typography>Description</Typography>
            <Typography>{movie.description}</Typography>

            <Typography>Director</Typography>
            <Typography>{movie.director}</Typography>

            <Typography>Actors</Typography>
            <Typography>{movie.actors!.join(" ")}</Typography>

            <Typography>Runtime</Typography>
            <Typography>{movie.runtime} mins</Typography>

            <Typography>Rating</Typography>
            <Typography>{movie.rating}</Typography>

            <Typography>Votes</Typography>
            <Typography>{movie.votes}</Typography>

            <Typography>Revenue</Typography>
            <Typography>${movie.revenue!.toLocaleString()}</Typography> {/* toLocaleString will add the commas every thousand, so for example, 1000000 will become 1,000,000 */}

            <Typography>Metascore</Typography>
            <Typography>{movie.metascore}</Typography>
            
            
        </Grid2>
    )
}

const generateModal = ({movie} : {movie : MovieDTO}) => {
    <Modal>
        <GenerateMovieDetail movie={movie}/>
    </Modal>
}

export default generateModal;