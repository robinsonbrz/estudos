package br.com.caelum.vraptor.interceptor;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.annotations.Public;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.controller.LoginController;
import br.com.caelum.vraptor.model.UsuarioLogado;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;

@Intercepts
public class AutorizadorInterceptor {

	private final UsuarioLogado usuarioLogado;
	private final Validator validator;
	private final ControllerMethod controllerMethod;

	@Inject
	public AutorizadorInterceptor(UsuarioLogado usuarioLogado,
			Validator validator, ControllerMethod controllerMethod) {
		this.usuarioLogado = usuarioLogado;
		this.validator = validator;
		this.controllerMethod = controllerMethod;
	}

	@Deprecated
	public AutorizadorInterceptor() {
		this(null, null, null);
	}

	@Accepts
	public boolean accepts() {
		return !controllerMethod.containsAnnotation(Public.class);
	}

	@AroundCall
	public void intercepta(SimpleInterceptorStack stack) {
		if (usuarioLogado.getUsuario() == null) {
			validator.add(new I18nMessage("login", "login.necessarioLogin"));
			validator.onErrorUsePageOf(LoginController.class).formulario();
			return;
		}
		stack.next();
	}
}
