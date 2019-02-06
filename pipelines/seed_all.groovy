job('Seed All') {
  scm {
    git ('https://github.com/batrako/pipelines.git')
  }
  steps {
    dsl {
      external('pipelines/*.groovy')     
      removeAction('DELETE')
    }
  }
}
