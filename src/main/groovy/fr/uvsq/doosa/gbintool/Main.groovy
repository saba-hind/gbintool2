package fr.uvsq.doosa.gbintool


import groovy.util.CliBuilder

class Main {
    static void main(def args) {
      
	def cli = new CliBuilder(usage: 'gbintool <action> [<options>] <entrée1>:<entrée2>:... ')
	cli.h(longOpt:'help', 'aide')
	cli.o(longOpt:'output', args:1,argName:'file','destination (sans option pour la sortie standard)')
	cli.csv( 'sortie au format CSV (défaut)')
	cli.parquet( 'sortie au format Avro/Parquet')
	cli.s(longOpt:'size', 'taille des fichiers de sortie')
	cli.n(longOpt:'n1st', 'traite uniquement les n premiers objets')
	cli.r(longOpt:'nrand', 'traite n objets au hasard')
	

	def opt = cli.parse(args)

	if(opt.h){
	cli.usage()
	}

    }

    String returnHello() {
        'Hello Datascaliens'
    }
}