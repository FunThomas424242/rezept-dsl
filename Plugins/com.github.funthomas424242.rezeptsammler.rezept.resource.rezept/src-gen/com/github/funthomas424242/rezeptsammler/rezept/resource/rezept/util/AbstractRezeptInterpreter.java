/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.util;

import com.github.funthomas424242.rezeptsammler.rezept.AblagePfad;
import com.github.funthomas424242.rezeptsammler.rezept.Absatz;
import com.github.funthomas424242.rezeptsammler.rezept.Anmerkung;
import com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt;
import com.github.funthomas424242.rezeptsammler.rezept.Autor;
import com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag;
import com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge;
import com.github.funthomas424242.rezeptsammler.rezept.Bild;
import com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.DiaetTag;
import com.github.funthomas424242.rezeptsammler.rezept.InternetPfad;
import com.github.funthomas424242.rezeptsammler.rezept.Kommentar;
import com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle;
import com.github.funthomas424242.rezeptsammler.rezept.Lizenz;
import com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad;
import com.github.funthomas424242.rezeptsammler.rezept.Menge;
import com.github.funthomas424242.rezeptsammler.rezept.Notiz;
import com.github.funthomas424242.rezeptsammler.rezept.Personenquelle;
import com.github.funthomas424242.rezeptsammler.rezept.Preis;
import com.github.funthomas424242.rezeptsammler.rezept.Produkt;
import com.github.funthomas424242.rezeptsammler.rezept.ProduktImport;
import com.github.funthomas424242.rezeptsammler.rezept.ProduktRef;
import com.github.funthomas424242.rezeptsammler.rezept.Produktliste;
import com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung;
import com.github.funthomas424242.rezeptsammler.rezept.Quelle;
import com.github.funthomas424242.rezeptsammler.rezept.Rezept;
import com.github.funthomas424242.rezeptsammler.rezept.RezeptImport;
import com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste;
import com.github.funthomas424242.rezeptsammler.rezept.StoffTag;
import com.github.funthomas424242.rezeptsammler.rezept.Tag;
import com.github.funthomas424242.rezeptsammler.rezept.Tipp;
import com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge;
import com.github.funthomas424242.rezeptsammler.rezept.Zutat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractRezeptInterpreter<ResultType, ContextType> {
	
	private Stack<EObject> interpretationStack = new Stack<EObject>();
	private List<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptInterpreterListener> listeners = new ArrayList<com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptInterpreterListener>();
	private EObject nextObjectToInterprete;
	private ContextType currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Rezept) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Rezept((com.github.funthomas424242.rezeptsammler.rezept.Rezept) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.ProduktImport) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport((com.github.funthomas424242.rezeptsammler.rezept.ProduktImport) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Produkt) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Produkt((com.github.funthomas424242.rezeptsammler.rezept.Produkt) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung((com.github.funthomas424242.rezeptsammler.rezept.BuchBeschreibung) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung((com.github.funthomas424242.rezeptsammler.rezept.ProjektBeschreibung) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle((com.github.funthomas424242.rezeptsammler.rezept.Literaturquelle) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt((com.github.funthomas424242.rezeptsammler.rezept.Arbeitsschritt) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Kommentar) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Kommentar((com.github.funthomas424242.rezeptsammler.rezept.Kommentar) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.ProduktRef) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef((com.github.funthomas424242.rezeptsammler.rezept.ProduktRef) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Zutat) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Zutat((com.github.funthomas424242.rezeptsammler.rezept.Zutat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Tipp) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Tipp((com.github.funthomas424242.rezeptsammler.rezept.Tipp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.RezeptImport) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport((com.github.funthomas424242.rezeptsammler.rezept.RezeptImport) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.StoffTag) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_StoffTag((com.github.funthomas424242.rezeptsammler.rezept.StoffTag) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag((com.github.funthomas424242.rezeptsammler.rezept.BenutzerTag) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.DiaetTag) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag((com.github.funthomas424242.rezeptsammler.rezept.DiaetTag) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Tag) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Tag((com.github.funthomas424242.rezeptsammler.rezept.Tag) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste((com.github.funthomas424242.rezeptsammler.rezept.Rezeptliste) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Preis) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Preis((com.github.funthomas424242.rezeptsammler.rezept.Preis) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Menge) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Menge((com.github.funthomas424242.rezeptsammler.rezept.Menge) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Anmerkung) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung((com.github.funthomas424242.rezeptsammler.rezept.Anmerkung) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Notiz) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Notiz((com.github.funthomas424242.rezeptsammler.rezept.Notiz) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge((com.github.funthomas424242.rezeptsammler.rezept.BestimmteMenge) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge((com.github.funthomas424242.rezeptsammler.rezept.UnbestimmteMenge) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Produktliste) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Produktliste((com.github.funthomas424242.rezeptsammler.rezept.Produktliste) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Lizenz) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Lizenz((com.github.funthomas424242.rezeptsammler.rezept.Lizenz) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Autor) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Autor((com.github.funthomas424242.rezeptsammler.rezept.Autor) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Personenquelle) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle((com.github.funthomas424242.rezeptsammler.rezept.Personenquelle) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Quelle) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Quelle((com.github.funthomas424242.rezeptsammler.rezept.Quelle) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Bild) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Bild((com.github.funthomas424242.rezeptsammler.rezept.Bild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.InternetPfad) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad((com.github.funthomas424242.rezeptsammler.rezept.InternetPfad) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad((com.github.funthomas424242.rezeptsammler.rezept.LokalerPfad) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.AblagePfad) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad((com.github.funthomas424242.rezeptsammler.rezept.AblagePfad) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof com.github.funthomas424242.rezeptsammler.rezept.Absatz) {
			result = interprete_com_github_funthomas424242_rezeptsammler_rezept_Absatz((com.github.funthomas424242.rezeptsammler.rezept.Absatz) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Rezept(Rezept rezept, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_ProduktImport(ProduktImport produktImport, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Produkt(Produkt produkt, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_BuchBeschreibung(BuchBeschreibung buchBeschreibung, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_ProjektBeschreibung(ProjektBeschreibung projektBeschreibung, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Literaturquelle(Literaturquelle literaturquelle, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Arbeitsschritt(Arbeitsschritt arbeitsschritt, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Kommentar(Kommentar kommentar, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_ProduktRef(ProduktRef produktRef, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Zutat(Zutat zutat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Tipp(Tipp tipp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_RezeptImport(RezeptImport rezeptImport, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Tag(Tag tag, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_StoffTag(StoffTag stoffTag, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_BenutzerTag(BenutzerTag benutzerTag, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Rezeptliste(Rezeptliste rezeptliste, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_DiaetTag(DiaetTag diaetTag, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Preis(Preis preis, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Menge(Menge menge, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Anmerkung(Anmerkung anmerkung, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Notiz(Notiz notiz, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_BestimmteMenge(BestimmteMenge bestimmteMenge, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_UnbestimmteMenge(UnbestimmteMenge unbestimmteMenge, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Produktliste(Produktliste produktliste, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Lizenz(Lizenz lizenz, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Autor(Autor autor, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Personenquelle(Personenquelle personenquelle, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Quelle(Quelle quelle, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Bild(Bild bild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_AblagePfad(AblagePfad ablagePfad, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_InternetPfad(InternetPfad internetPfad, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_LokalerPfad(LokalerPfad lokalerPfad, ContextType context) {
		return null;
	}
	
	public ResultType interprete_com_github_funthomas424242_rezeptsammler_rezept_Absatz(Absatz absatz, ContextType context) {
		return null;
	}
	
	private void notifyListeners(EObject element) {
		for (com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(Collection<? extends EObject> objects) {
		for (EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(Collection<? extends EObject> objects) {
		List<EObject> reverse = new ArrayList<EObject>(objects.size());
		reverse.addAll(objects);
		Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(EObject root) {
		List<EObject> objects = new ArrayList<EObject>();
		objects.add(root);
		Iterator<EObject> it = root.eAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(com.github.funthomas424242.rezeptsammler.rezept.resource.rezept.IRezeptInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public Stack<EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public ContextType getCurrentContext() {
		return currentContext;
	}
	
}
