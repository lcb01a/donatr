import React from 'react'
import { Route, IndexRoute } from 'react-router'
import CoreLayout from 'layouts/CoreLayout'
import HomeView from 'views/HomeView'
import AboutView from 'views/AboutView'
import LoginView from 'views/LoginView'
import {requireAuthentication} from '../components/AuthenticatedComponent'

export default (
  <Route path='/' component={CoreLayout}>
    <IndexRoute component={requireAuthentication(HomeView)} />
    <Route path='/login' component={LoginView} />
    <Route path='/about' component={requireAuthentication(AboutView)} />
  </Route>
)
