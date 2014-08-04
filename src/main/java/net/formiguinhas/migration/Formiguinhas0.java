package net.formiguinhas.migration;

import org.apache.log4j.Logger;

import com.webobjects.eoaccess.EOModel;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationTable;
import er.extensions.migration.ERXModelVersion;
import er.extensions.migration.IERXPostMigration;

	public class Formiguinhas0 extends ERXMigrationDatabase.Migration implements IERXPostMigration

	 {

		private static Logger LOG = Logger.getLogger(Formiguinhas0.class);

		@Override
		public NSArray<ERXModelVersion> modelDependencies() {
		     //return new NSArray<ERXModelVersion>(new ERXModelVersion[] { new ERXModelVersion("ERAttachment", 0) });
			return null;
		}

		@Override
		public void downgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
			// DO NOTHING
		}


		@Override
		public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
			ERXMigrationTable acordoEntreParesTable = database.newTableNamed("AcordoEntrePares");
			acordoEntreParesTable.newIntegerColumn("aceitanteID", false);
			acordoEntreParesTable.newIntegerColumn("id", false);
			acordoEntreParesTable.newIntegerColumn("proponenteID", false);
			acordoEntreParesTable.newStringColumn("status", 50, false);
			acordoEntreParesTable.create();
		 	acordoEntreParesTable.setPrimaryKey("id");

			ERXMigrationTable dadosBancariosTable = database.newTableNamed("DadosBancarios");
			dadosBancariosTable.newStringColumn("banco", 50, false);
			dadosBancariosTable.newIntegerColumn("id", false);
			dadosBancariosTable.newIntegerColumn("usuarioID", false);
			dadosBancariosTable.create();
		 	dadosBancariosTable.setPrimaryKey("id");

			ERXMigrationTable enderecoTable = database.newTableNamed("Endereco");
			enderecoTable.newIntegerColumn("id", false);
			enderecoTable.newStringColumn("nome", 16, false);
			enderecoTable.create();
		 	enderecoTable.setPrimaryKey("id");

			ERXMigrationTable enderecoXFornecedorTable = database.newTableNamed("EnderecoXFornecedor");
			enderecoXFornecedorTable.newIntegerColumn("enderecoId", false);
			enderecoXFornecedorTable.newIntegerColumn("fornecedorId", false);
			enderecoXFornecedorTable.create();
		 	enderecoXFornecedorTable.setPrimaryKey("enderecoId", "fornecedorId");

			ERXMigrationTable enderecoXUsuarioTable = database.newTableNamed("EnderecoXUsuario");
			enderecoXUsuarioTable.newIntegerColumn("enderecoId", false);
			enderecoXUsuarioTable.newIntegerColumn("usuarioId", false);
			enderecoXUsuarioTable.create();
		 	enderecoXUsuarioTable.setPrimaryKey("enderecoId", "usuarioId");

			ERXMigrationTable entregaTable = database.newTableNamed("Entrega");
			entregaTable.newIntegerColumn("acordoID", false);
			entregaTable.newIntegerColumn("enderecoID", false);
			entregaTable.newIntegerColumn("id", false);
			entregaTable.create();
		 	entregaTable.setPrimaryKey("id");

			ERXMigrationTable entregaXListaDeComprasDeUsuarioTable = database.newTableNamed("EntregaXListaDeComprasDeUsuario");
			entregaXListaDeComprasDeUsuarioTable.newIntegerColumn("entregaId", false);
			entregaXListaDeComprasDeUsuarioTable.newIntegerColumn("listaDeComprasDeUsuarioId", false);
			entregaXListaDeComprasDeUsuarioTable.create();
		 	entregaXListaDeComprasDeUsuarioTable.setPrimaryKey("entregaId", "listaDeComprasDeUsuarioId");

			ERXMigrationTable foneTable = database.newTableNamed("Fone");
			foneTable.newIntegerColumn("ddd", false);
			foneTable.newIntegerColumn("id", false);
			foneTable.newStringColumn("numero", 9, false);
			foneTable.newStringColumn("tipo", 50, false);
			foneTable.create();
		 	foneTable.setPrimaryKey("id");

			ERXMigrationTable foneXFornecedorTable = database.newTableNamed("FoneXFornecedor");
			foneXFornecedorTable.newIntegerColumn("foneId", false);
			foneXFornecedorTable.newIntegerColumn("fornecedorId", false);
			foneXFornecedorTable.create();
		 	foneXFornecedorTable.setPrimaryKey("foneId", "fornecedorId");

			ERXMigrationTable fornecedorTable = database.newTableNamed("Fornecedor");
			fornecedorTable.newStringColumn("cnpj", 12, true);
			fornecedorTable.newIntegerColumn("id", false);
			fornecedorTable.newStringColumn("inscricaoEstadual", 9, true);
			fornecedorTable.newStringColumn("nome", 16, false);
			fornecedorTable.create();
		 	fornecedorTable.setPrimaryKey("id");

			ERXMigrationTable fornecedorXUsuarioTable = database.newTableNamed("FornecedorXUsuario");
			fornecedorXUsuarioTable.newIntegerColumn("fornecedorId", false);
			fornecedorXUsuarioTable.newIntegerColumn("usuarioId", false);
			fornecedorXUsuarioTable.create();
		 	fornecedorXUsuarioTable.setPrimaryKey("fornecedorId", "usuarioId");

			ERXMigrationTable listaDeComprasTable = database.newTableNamed("ListaDeCompras");
			listaDeComprasTable.newTimestampColumn("dataLimiteParaPedidos", true);
			listaDeComprasTable.newIntegerColumn("fornecedorID", false);
			listaDeComprasTable.newIntegerColumn("id", false);
			listaDeComprasTable.newStringColumn("nome", 100, false);
			listaDeComprasTable.newIntegerColumn("organizadorID", false);
			listaDeComprasTable.newStringColumn("status", 50, false);
			listaDeComprasTable.newBigDecimalColumn("valorMaximo", 38, 4, true);
			listaDeComprasTable.newBigDecimalColumn("valorMinimo", 38, 4, true);
			listaDeComprasTable.create();
		 	listaDeComprasTable.setPrimaryKey("id");

			ERXMigrationTable listaDeComprasDeUsuarioTable = database.newTableNamed("ListaDeComprasDeUsuario");
			listaDeComprasDeUsuarioTable.newIntegerColumn("id", false);
			listaDeComprasDeUsuarioTable.newIntegerColumn("usuarioID", false);
			listaDeComprasDeUsuarioTable.create();
		 	listaDeComprasDeUsuarioTable.setPrimaryKey("id");

			ERXMigrationTable listaDeComprasDeUsuarioXPagamentoTable = database.newTableNamed("ListaDeComprasDeUsuarioXPagamento");
			listaDeComprasDeUsuarioXPagamentoTable.newIntegerColumn("listaDeComprasDeUsuarioId", false);
			listaDeComprasDeUsuarioXPagamentoTable.newIntegerColumn("pagamentoId", false);
			listaDeComprasDeUsuarioXPagamentoTable.create();
		 	listaDeComprasDeUsuarioXPagamentoTable.setPrimaryKey("listaDeComprasDeUsuarioId", "pagamentoId");

			ERXMigrationTable listaDeComprasDeUsuarioXProdutoEmListaTable = database.newTableNamed("ListaDeComprasDeUsuarioXProdutoEmLista");
			listaDeComprasDeUsuarioXProdutoEmListaTable.newIntegerColumn("listaDeComprasDeUsuarioId", false);
			listaDeComprasDeUsuarioXProdutoEmListaTable.newIntegerColumn("produtoEmListaId", false);
			listaDeComprasDeUsuarioXProdutoEmListaTable.create();
		 	listaDeComprasDeUsuarioXProdutoEmListaTable.setPrimaryKey("listaDeComprasDeUsuarioId", "produtoEmListaId");

			ERXMigrationTable listaDeComprasDeUsuarioXTransferenciaDePagamentoTable = database.newTableNamed("ListaDeComprasDeUsuarioXTransferenciaDePagamento");
			listaDeComprasDeUsuarioXTransferenciaDePagamentoTable.newIntegerColumn("listaDeComprasDeUsuarioId", false);
			listaDeComprasDeUsuarioXTransferenciaDePagamentoTable.newIntegerColumn("transferenciaDePagamentoId", false);
			listaDeComprasDeUsuarioXTransferenciaDePagamentoTable.create();
		 	listaDeComprasDeUsuarioXTransferenciaDePagamentoTable.setPrimaryKey("listaDeComprasDeUsuarioId", "transferenciaDePagamentoId");

			ERXMigrationTable pagamentoTable = database.newTableNamed("Pagamento");
			pagamentoTable.newIntegerColumn("acordoID", false);
			pagamentoTable.newIntegerColumn("id", false);
			pagamentoTable.newBigDecimalColumn("valor", 38, 4, false);
			pagamentoTable.create();
		 	pagamentoTable.setPrimaryKey("id");

			ERXMigrationTable pagamentoXTransferenciaDePagamentoTable = database.newTableNamed("PagamentoXTransferenciaDePagamento");
			pagamentoXTransferenciaDePagamentoTable.newIntegerColumn("pagamentoId", false);
			pagamentoXTransferenciaDePagamentoTable.newIntegerColumn("transferenciaDePagamentoId", false);
			pagamentoXTransferenciaDePagamentoTable.create();
		 	pagamentoXTransferenciaDePagamentoTable.setPrimaryKey("pagamentoId", "transferenciaDePagamentoId");

			ERXMigrationTable produtoTable = database.newTableNamed("Produto");
			produtoTable.newIntegerColumn("fornecedorID", false);
			produtoTable.newIntegerColumn("id", false);
			produtoTable.newStringColumn("nome", 100, false);
			produtoTable.newBigDecimalColumn("preco", 38, 4, true);
			produtoTable.newBigDecimalColumn("quantidadeEmQueEhVendido", 38, 2, false);
			produtoTable.newStringColumn("unidade", 50, true);
			produtoTable.create();
		 	produtoTable.setPrimaryKey("id");


			ERXMigrationTable produtoEmListaTable = database.newTableNamed("ProdutoEmLista");
			produtoEmListaTable.newIntegerColumn("id", false);
			produtoEmListaTable.newIntegerColumn("listaDeComprasId", false);
			produtoEmListaTable.newBigDecimalColumn("preco", 38, 4, false);
			produtoEmListaTable.newIntegerColumn("produtoId", false);
			produtoEmListaTable.newBigDecimalColumn("quantidadeEmQueEhVendido", 38, 2, false);
			produtoEmListaTable.create();
		 	produtoEmListaTable.setPrimaryKey("id");

			ERXMigrationTable transferenciaDePagamentoTable = database.newTableNamed("TransferenciaDePagamento");
			transferenciaDePagamentoTable.newIntegerColumn("acordoEntreParesID", false);
			transferenciaDePagamentoTable.newIntegerColumn("id", false);
			transferenciaDePagamentoTable.create();
		 	transferenciaDePagamentoTable.setPrimaryKey("id");

		 	ERXMigrationTable usuarioTable = database.newTableNamed("Usuario");
			usuarioTable.newStringColumn("cpf", 11, true);
			usuarioTable.newStringColumn("email", 50, false);
			usuarioTable.newIntegerColumn("id", false);
			usuarioTable.newStringColumn("login", 16, false);
			usuarioTable.newStringColumn("nome", 50, false);
			usuarioTable.newStringColumn("password", 16, false);
			usuarioTable.create();
		 	usuarioTable.setPrimaryKey("id");

			ERXMigrationTable foneXUsuarioTable = database.newTableNamed("FoneXUsuario");
			foneXUsuarioTable.newIntegerColumn("foneId", false);
			foneXUsuarioTable.newIntegerColumn("usuarioId", false);
			foneXUsuarioTable.create();
		 	foneXUsuarioTable.setPrimaryKey("foneId", "usuarioId");

			foneXUsuarioTable.addForeignKey("foneId", "Fone", "id");
			foneXUsuarioTable.addForeignKey("usuarioId", "Usuario", "id");


		    LOG.info("Iniciado população de dados!");

		    ERXJDBCUtilities.executeUpdateScriptFromResourceNamed(database.adaptorChannel(), "Formiguinhas0-" + ERXJDBCUtilities.databaseProductName(database.adaptorChannel()) + ".sql", null);


		}

			@Override
			public void postUpgrade(EOEditingContext editingContext,
					EOModel model) throws Throwable {
				// TODO Auto-generated method stub

			}


}
