import React, { useEffect, useState } from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button, Grid, Typography } from '@mui/material';
import { useAppDispatch, useMLSelector } from './store/hooks';
import DefaultMovieList from './components/defaultMovieList';
import MovieList from './components/movieList';
import DatePicker from 'react-datepicker'
import { getTop10MoviesByRevenueByYear } from './store/MovieList';
import 'react-datepicker/dist/react-datepicker.css'
import GenerateModal from './components/movieDetail';



function App() {
  const dispatch = useAppDispatch()
  const [toggleFilteredList, setToggleFilteredList] = useState(false)
  const [toggleFilteredYearList, setToggleFilteredYearList] = useState(false)
  const state = useMLSelector(state => state)
  const [showModal, setShowModal] = useState(true)
  const [date, setDate] = useState<Date | null>(new Date())

  useEffect(() =>
    {
      dispatch(getTop10MoviesByRevenueByYear(date!.getFullYear()))
    }, [date] 
  )
 

  const GenerateDatePicker = () => {
      return (
        <div style={{marginTop:"0.5rem"}}>
          <DatePicker
            selected={date}
            onChange={(date) => setDate(date)}
            dateFormat="yyyy"
            dateFormatCalendar="yyyy"
            showYearPicker
          />
        </div>
        
      )
    }

  return (
    <div>
      <div className="MovieRanking">
        <Typography variant={"h6"}> Movie Ranking </Typography>
        <div className="ToggleButton">
          <Grid
            container
            direction={"row"}
            spacing={"6"}
          >
            <Grid item>

              <Button 
                color="secondary" variant={toggleFilteredList ? "contained" : "outlined"} 
                size='small' 
                onClick={() => {
                    setToggleFilteredYearList(false) 
                    setToggleFilteredList(!toggleFilteredList)    
                }}
                sx={{textTransform: 'capitalize'}}
              >Top 10 Revenue</Button>

            </Grid>

            <Grid item style={{zIndex:'1000'}}>

              <Button 
                  color="secondary" variant={toggleFilteredYearList ? "contained" : "outlined"} 
                  size='small' 
                  onClick={() => {
                      setToggleFilteredList(false) 
                      setToggleFilteredYearList(!toggleFilteredYearList)    
                  }}
                  sx={{textTransform: 'capitalize'}}
                >Top 10 Revenue per Year</Button>

                {
                  toggleFilteredYearList
                  && <GenerateDatePicker/>
                }
                
            </Grid>
          </Grid>
        </div>
      </div>

      {
       
        (
          toggleFilteredList
          && state.filteredMovieList !== undefined
          && <div className="MovieList"> 
              <DefaultMovieList rows={state.filteredMovieList} setShowModal={setShowModal}/>
          </div>
        )

        ||

        (
          toggleFilteredYearList
          && state.filteredByYearMovieList !== undefined
          && <div className="MovieList"> 
              <DefaultMovieList rows={state.filteredByYearMovieList} setShowModal={setShowModal}/>
          </div>
        )

        ||

        (
          <div className="MovieList">
            <MovieList setShowModal={setShowModal}/>
          </div>
        )
      }

      {
        state.selected !== undefined 
        && <GenerateModal movie={state.selected} showModal={showModal} setShowModal={setShowModal}/>
      }
      
    </div>
  );
}

export default App;
