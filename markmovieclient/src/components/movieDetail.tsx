import { Box } from "@mui/material";
import Typography from "@mui/material/Typography";
import React from "react";
import { MovieDTO } from "../movielistapi";



const GenerateMovieDetail = ({movie} : {movie : MovieDTO}) => {
    console.log("In GenerateModal")
    return (
        <Box>

            <Typography style={{opacity:"0.5"}}>Year</Typography>
            <Typography style={{marginBottom:"10px", opacity:"0.5"}}><b>{movie.releaseYear}</b></Typography>

            <Typography style={{opacity:"0.5"}}>Description</Typography>
            <Typography style={{marginBottom:"10px"}}>{movie.description}</Typography>

            <Typography style={{opacity:"0.5"}}>Director</Typography>
            <Typography style={{marginBottom:"10px"}}>{movie.director}</Typography>

            <Typography style={{opacity:"0.5"}}>Actors</Typography>
            <Typography style={{marginBottom:"10px", color:"blue"}}>{movie.actors!.join(" ")}</Typography>

            <Typography style={{opacity:"0.5"}}>Runtime</Typography>
            <Typography style={{marginBottom:"10px"}}>{movie.runtime} mins</Typography>

            <Typography style={{opacity:"0.5"}}>Rating</Typography>
            <Typography style={{marginBottom:"10px"}}>{movie.rating}</Typography>

            <Typography style={{opacity:"0.5"}}>Votes</Typography>
            <Typography style={{marginBottom:"10px"}}>{movie.votes}</Typography>

            <Typography style={{opacity:"0.5"}}>Revenue</Typography>
            <Typography style={{marginBottom:"10px"}}>${movie.revenue!.toLocaleString()}</Typography> {/* toLocaleString will add the commas every thousand, so for example, 1000000 will become 1,000,000 */}

            <Typography style={{opacity:"0.5"}}>Metascore</Typography>
            <Typography style={{marginBottom:"10px"}}>{movie.metascore}</Typography>
            
            
        </Box>
    )
}

const GenerateModal = ({movie} : {movie : MovieDTO}) => {
    return(
        <GenerateMovieDetail movie={movie}/>
    )
    
}

export default GenerateModal;