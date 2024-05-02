# MarkMovieList

Run "start.bat" to start the program. It will open two command lines, one for the server and one for the client.
Once both are on, open localhost:3000
Requirements: Java 17, Maven, npm


# About the program

The data for the movies was generated via AI. I think using an API would be way better, but I wasn't able to work on two different days and decided to go with this solution instead to save time.
There are 46 movies total as of the writing of this, with 10 being from 2017 so I could test a full list for the Top 10 Revenue per Year requirement.

The back-end processes all requests regarding the movie lists. To fulfill requirement number 3, I made some queries for the repository. Initially, I tried to have the queries
done without @Query with just the keyword system, which worked for the top revenue movie list, but for the top revenue by year, I had to do parts of the query myself. I'm not
very experienced with queries, so I'm not sure if this was the correct way to go.
Additionally, for the back-end, I have a Movie entity and a MovieDTO that carry the same information. I was told that it is always better to have a data transfer object for
the information we want to send to the front-end, even if it contains all the information stored by an object.

For the front-end, I used some libraries to achieve certain functions or to achieve a more elegant look. I used ReactRedux (and its toolkit), React-Bootstrap, react-datepicker, react-infinite-scroll-component and MaterialUI.
ReactRedux was used to maintain a state with the movieLists after fetching them from the back-end. React-infinite-scroll-component was used to build the infinite scrolling element of the default movie list, fulfilling requirement 1.
I had never built anything with infinite scrolling, so I'm not sure if this was the correct way to go, but it seems to work well.
The remaining libraries were used to make a cleaner UI. I'm not very familiar with CSS despite having worked with it before, so I opted to have these libraries to help me achieve something closer to the images provided.
For the movie list with the top revenue movies for a selected year, I opted for react-datepicker, limited to only years, instead of a dropdown, as I felt it would have done the job better than a dropdown with a large number of options.

Fianlly, to have the front-end make fetch requests to the back-end, I utilized openapigen (https://openapi-generator.tech/), a tool that I was shown during university, which automatically
generates the necessary code by providing it with a .yaml file containing the specification of the back-end's api, which I got by using swaggerUI, like this: http://localhost:8080/swagger-ui/index.html.
By then clicking /v3/api-docs and copying the .json text to swaggerUI's editor (https://editor.swagger.io/) it automatically converts it to a .yaml format, which can then be fed to openapigen.