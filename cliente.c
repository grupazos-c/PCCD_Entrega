#include "nodo.h"


int main(int argc, char *argv[]) {

	int id_nodo;
	int num_anulaciones, num_pagos, num_prereservas, num_consultas;

	if (argc != 6) { printf("Numero de argumentos incorrecto.\n"); exit(0); }

	id_nodo = atoi(argv[1]);
	num_anulaciones = atoi(argv[2]);
	num_pagos = atoi(argv[3]);
	num_prereservas = atoi(argv[4]);
	num_consultas = atoi(argv[5]);

	int clave = ftok("./README.md", id_nodo);
	int id_buzon = msgget(clave, 0777);
	if (id_buzon < 0) {
		printf("\nNo existe el buzon\n");
		perror("msgget");
		exit(0);
	}
	printf("Buzón creado con clave: %i\n", id_buzon);

	struct MensajeIntranodo anulaciones;
		anulaciones.mtype = ANULACION;
	struct MensajeIntranodo pagos;
		pagos.mtype = PAGO;
	struct MensajeIntranodo prereservas;
		prereservas.mtype = PRERESERVA;
	struct MensajeIntranodo consultas;
		consultas.mtype = CONSULTA;

	for (int i=0; i<num_anulaciones; i++){
		msgsnd(id_buzon, &anulaciones, sizeof(anulaciones) - sizeof(long), 0);
		printf("Mensaje de tipo: %i enviado a nodo %i\n",ANULACION , id_nodo);
	}
	for (int i=0; i<num_pagos; i++){
		msgsnd(id_buzon, &pagos, sizeof(pagos) - sizeof(long), 0);
		printf("Mensaje de tipo: %i enviado a nodo %i\n",PAGO , id_nodo);
	}
	for (int i=0; i<num_prereservas; i++){
		msgsnd(id_buzon, &prereservas, sizeof(prereservas) - sizeof(long), 0);
		printf("Mensaje de tipo: %i enviado a nodo %i\n",PRERESERVA , id_nodo);
	}
	for (int i=0; i<num_consultas; i++){
		msgsnd(id_buzon, &consultas, sizeof(consultas) - sizeof(long), 0);
		printf("Mensaje de tipo: %i enviado a nodo %i\n",CONSULTA , id_nodo);
	}

}
