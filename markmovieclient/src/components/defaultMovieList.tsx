import { TableContainer, TableCell, TableHead, Table, TableRow, TableBody, IconButton} from "@mui/material"
import { Visibility } from "@mui/icons-material"
import { MovieDTO } from "../movielistapi"
import { useAppDispatch } from "../store/hooks"
import { setSelected } from "../store/MovieList"

const DefaultMovieList = ({rows, setShowModal} : {rows: MovieDTO[], setShowModal: React.Dispatch<React.SetStateAction<boolean>>}) => {
    const dispatch = useAppDispatch()
    return (
        <div>
            <TableContainer>
                <Table stickyHeader aria-label="sticky table">
                    <TableHead>
                        <TableRow>
                            <TableCell style={{backgroundColor:"papayawhip"}}><b>Ranking</b></TableCell>
                            <TableCell style={{backgroundColor:"papayawhip"}}><b>Title</b></TableCell>
                            <TableCell style={{backgroundColor:"papayawhip"}}><b>Year</b></TableCell>
                            <TableCell style={{backgroundColor:"papayawhip"}}><b>Revenue</b></TableCell>
                            <TableCell style={{backgroundColor:"papayawhip"}}></TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {
                            rows.map((row, index) => (
                                <TableRow>
                                    <TableCell style={{fontSize:"1rem"}}>{index}</TableCell>
                                    <TableCell style={{fontSize:"1rem"}}>{row.movieTitle}</TableCell>
                                    <TableCell style={{fontSize:"1rem"}}>{row.releaseYear}</TableCell>
                                    <TableCell style={{fontSize:"1rem"}}>${row.revenue?.toLocaleString()}</TableCell>
                                    <TableCell>
                                        <IconButton size="medium">
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

export default DefaultMovieList
