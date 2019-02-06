pipelineJob('CaaS/K8sPvCreate') {
    description('pipeline for PV creation on CaaS')
    parameters {
        textParam('idegarApp', 'stack-elastic-arq','IDEGAR Aplication ID')
        textParam('entorno', 'pro','Environment ID')
        textParam('clusters', 'DC02','CaaS Clusters list for PVs/PVs Claim Deploy')
    }
    definition {
        cpsScm { 
            scm { 
                git { 
                    remote { url('https://github.com/batrako/pipelines') } 
                    branches('master') 
                    scriptPath('jobs/pvs') 
                    extensions { }  // required as otherwise it may try to tag the repo, which you may not want 
                } 
            } 
        } 
    }
}