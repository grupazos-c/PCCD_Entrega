#include "nodo.h"

void initbuzones();
void prueba1();

int main(int argc, char *argv[]) {

	int prueba;

	initbuzones();

	struct MensajeIntranodo anulaciones;
		anulaciones.mtype = ANULACION;
	struct MensajeIntranodo pagos;
		pagos.mtype = PAGO;
	struct MensajeIntranodo prereservas;
		prereservas.mtype = PRERESERVA;
	struct MensajeIntranodo consultas;
		consultas.mtype = CONSULTA;

		do {
			printf("Seleccione que prueba desea ejecutar: ");
		} while (scanf("%d",&prueba) != 1);

	    switch (prueba) {
			case 1:
				prueba1();
				break;
			default:
				printf("Adiós \n")
				return;
				break;
		}

}

void initbuzones(){
	for (i = 0; i < NUM_NODOS; ++i) {
		int clave = ftok("./README.md", id_nodo);
		int id_buzon = msgget(clave, 0777);
		if (id_buzon < 0) {
			printf("\nNo existe el buzon\n");
			perror("msgget");
			exit(0);
		}
		printf("Buzón creado con clave: %i\n", id_buzon);
	}
}

void prueba1() {

}
