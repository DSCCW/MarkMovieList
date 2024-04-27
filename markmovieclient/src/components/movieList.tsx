import React from "react";
import { Table } from "@mui/material";
import TableContainer from "@mui/material/TableContainer";
import TableHead from "@mui/material/TableHead";
import TableRow from "@mui/material/TableRow";
import TableCell from "@mui/material/TableCell";
import TableBody from "@mui/material/TableBody";
import IconButton from "@mui/material/IconButton";

interface testMovie {
    title: string,
    year: number,
    revenue: number
}

function createTestMovie(title: string, year: number, revenue: number) : testMovie {
    return {title, year, revenue};
}

const movieList = () => {

    const rows = [
        createTestMovie('Star Wars', 2000, 1000000),
        createTestMovie('Iron Man', 2008, 2000000),
        createTestMovie('Dune', 2021, 3000000),
        createTestMovie('Spider-Man', 2011, 7500000),
        createTestMovie('Titanic', 1997, 219512712),
      ];

    
    return (
        <DefaultMovieList rows={rows}/>
    )
        
}

const DefaultMovieList = ({rows} : {rows: testMovie[]}) => {
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
                                    <TableCell align="right">{row.title}</TableCell>
                                    <TableCell align="right">{row.year}</TableCell>
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

export default movieList;