import React, {Component} from 'react';
import './App.css';
import CssBaseline from "@material-ui/core/CssBaseline/CssBaseline";
import Grid from "@material-ui/core/Grid/Grid";
import IssueList from "./components/IssueList";
import Issue from "./components/Issue";
import TopBar from "./components/TopBar";
import EditIssue from "./components/EditIssue";
import BrowserRouter from "react-router-dom/BrowserRouter";
import Switch from "react-router-dom/Switch";
import Route from "react-router-dom/Route";
import EmptyWorkspace from "./components/EmptyWorkspace";

const styles = {
  root: {
    flexGrow: 1,
    padding: 12,
    margin: 0,
    width: '100%',
    height: '100%'
  }
};

export default class App extends Component {
  render() {
    return (
      <BrowserRouter>
        <React.Fragment>
          <CssBaseline />

          <TopBar />

          <Grid container spacing={24} style={styles.root}>
            <Grid item xs={5} style={styles.grid}>
              <IssueList />
            </Grid>
            <Grid item xs={7} style={styles.grid}>
              <Switch>
                <Route path='/:issueId/edit' component={EditIssue} />
                <Route path='/:issueId' component={Issue} />
                <Route path='/' component={EmptyWorkspace} />
              </Switch>
            </Grid>
          </Grid>

        </React.Fragment>
      </BrowserRouter>
    );
  }
}