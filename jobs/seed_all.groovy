job('Seed All') {
  scm {
    git ('https://github.com/batrako/pipelines.git')
  }
  steps {
    dsl {
      folder('pruebas')
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}
