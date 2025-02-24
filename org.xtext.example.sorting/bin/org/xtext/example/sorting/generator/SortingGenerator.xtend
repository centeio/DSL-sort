/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.sorting.sorting.*
import java.util.Iterator
import org.eclipse.emf.ecore.EObject
import org.xtext.example.sorting.sorting.Config

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SortingGenerator extends AbstractGenerator {
	String packname = "pipesgraph";

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))

		fsa.generateFile("PipeStages.java", generatePipeStages(resource)); 
		fsa.generateFile(resource.allContents.filter(Config).map[name]+".java", generateClass(resource.contents.head as Config)); 
			
		fsa.generateFile("Component.java", 
			'''
			package �packname�;
			import java.util.HashMap;
			
			public abstract class Component extends PipeStages implements Comparable<Component>{
				protected int level = 0;
				Runnable call;
				protected HashMap<String, Port> inPorts = new HashMap<String, Port>();
				protected HashMap<String, Port> outPorts = new HashMap<String, Port>();				
				public Port getPort(String name){
					if(inPorts.get(name) != null) 
						return inPorts.get(name);
						return outPorts.get(name);
				}
				public int getLevel() {
					return level;
				}
				public void checkLevel(Component c){
					if(level<c.getLevel())
						level = c.getLevel()+1;
				}
				public int compareTo(Component c) {
					return Integer.compare(this.level, c.getLevel());
				}
				public void invoke(){
					call.run();
				}
				public void setCall(Runnable r) {
					call=r;
				}
			}''');
		 fsa.generateFile("Source.java", 
		 	'''
		 	package �packname�;
		 			 	
		 	public abstract class Source extends Component{

		 	}
		 	'''
		 );
		 
		 fsa.generateFile("Filter.java", 
		 	'''
		 	package �packname�;
		 	
		 	
		 	import java.util.HashMap;
		 	
		 	public abstract class Filter extends Component{

		 	}
		 	'''
		 );
		 fsa.generateFile("Sink.java", 
		 	'''
		 	package �packname�;
		 			 	
		 	public abstract class Sink extends Component{

		 	}'''
		 );
		 fsa.generateFile("Port.java", 
		 	'''
		 	package �packname�;
		 	import java.util.ArrayList;
		 	
		 	public class Port{
		 		protected Component component;
		 		protected String name;
		 		protected ArrayList<Edge> edges = new ArrayList<Edge>();
		 	
		 		public Port(String name, Component component){
		 			this.name = name;
		 			this.component = component;
		 		}
		 	
		 		public Component getComponent() {
		 			return component;
		 		}
		 	
		 		public void setComponent(Component component) {
		 			this.component = component;
		 		}
		 	
		 		public String getName() {
		 			return name;
		 		}
		 	
		 		public void setName(String name) {
		 			this.name = name;
		 		}
		 	
		 		public ArrayList<Edge> getEdges() {
		 			return edges;
		 		}
		 	
		 		public void setEdges(ArrayList<Edge> edges) {
		 			this.edges = edges;
		 		}
		 		public void addEdge(Edge edge){
		 			this.edges.add(edge);
		 		}
		 	}
		 	'''
		 );
		  fsa.generateFile("Edge.java", 
		 	'''
		 	package �packname�;
		 	public class Edge{
		 		protected Port source; // <n1.get(p1),n2.get(p2)> 
		 		protected Port target;
		 	
		 		public Edge(Port source, Port target){
		 			this.source = source;
		 			this.target = target;
		 		}
		 	
		 		public Port getSource() {
		 			return source;
		 		}
		 	
		 		public void setSource(Port source) {
		 			this.source = source;
		 		}
		 	
		 		public Port getTarget() {
		 			return target;
		 		}
		 	
		 		public void setTarget(Port target) {
		 			this.target = target;
		 		}
		 	}
		 	''');
		 	
		 	for(source: resource.allContents.toIterable.filter(Source)){
		 		fsa.generateFile(source.name + ".java",
		 			'''
			package �packname�;
			
			public class �source.name� extends Source{
			�FOR port : source.inPorts�
				private �port.type� �port.name�;
			�ENDFOR�
			�FOR port : source.outPorts�
				private �port.type� �port.name�;
			�ENDFOR�
				public �source.name�(String name){
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==source.name�
						case "�instance.name�":
						call = () -> {�instance.code.substring(2, instance.code.length - 2)�};
						break;
					�ENDIF�
					�ENDFOR�
					}
					�FOR port : source.inPorts�
						inPorts.put("�port.name�", new Port("�port.name�",this));
					�ENDFOR�					�FOR port : source.outPorts�
						outPorts.put("�port.name�", new Port("�port.name�",this));
					�ENDFOR�
				}
				�source.code.substring(2, source.code.length - 2)�

			} ''')}
		 	for(filter: resource.allContents.toIterable.filter(Filter)){
		 		fsa.generateFile(filter.name + ".java",
		 			'''
				package �packname�;
				public class �filter.name� extends Filter{
				�FOR port : filter.inPorts�
					private �port.type� �port.name�;
				�ENDFOR�
				�FOR port : filter.outPorts�
					private �port.type� �port.name�;
				�ENDFOR�
				public �filter.name�(String name){
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==filter.name�
						case "�instance.name�":
						call = () -> {�instance.code.substring(2, instance.code.length - 2)�};
						break;
					�ENDIF�
					�ENDFOR�
					}
					�FOR port : filter.inPorts�
						inPorts.put("�port.name�", new Port("�port.name�",this));
					�ENDFOR�
					�FOR port : filter.outPorts�
						outPorts.put("�port.name�", new Port("�port.name�",this));
					�ENDFOR�					
					}
					�filter.code.substring(2, filter.code.length - 2)�

				}''')}
				
		 	for(sink: resource.allContents.toIterable.filter(Sink)){
		 		fsa.generateFile(sink.name + ".java",
		 			'''
				package �packname�;
				public class �sink.name� extends Sink{
				�FOR port : sink.inPorts�
					private �port.type� �port.name�;
				�ENDFOR�
				�FOR port : sink.outPorts�
					private �port.type� �port.name�;
				�ENDFOR�
					public �sink.name�(String name){
					switch (name) {
					�FOR instance : resource.allContents.toIterable.filter(Instance)�
					�IF instance.component.name==sink.name�
						case "�instance.name�":
						call = () -> {�instance.code.substring(2, instance.code.length - 2)�};
						break;
					�ENDIF�
					�ENDFOR�
					}
				�FOR port : sink.inPorts�
					inPorts.put("�port.name�", new Port("�port.name�",this));
				�ENDFOR�
				�FOR port : sink.outPorts�
					outPorts.put("�port.name�", new Port("�port.name�",this));
				�ENDFOR�
				}
				�sink.code.substring(2, sink.code.length - 2)�

				}
		 	'''
		 	);
			fsa.generateFile("Graph.java", generate(resource.contents.head as Config)); 
		 	
		 	}
		 	
		 
		
	}
	
	def CharSequence generateClass(Config config) '''
	'''
	
	def CharSequence generatePipeStages(Resource resource)'''
	package �packname�;
		�FOR imp : resource.allContents.toIterable.filter(Import)�
		import �imp.name�;
		�ENDFOR�
		public abstract class PipeStages{
		/*Vars*/
		�FOR par : resource.allContents.toIterable.filter(Param)�
			�par.value�;
		�ENDFOR�

		}

	'''
	
	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
	
	def CharSequence generate(Config config)'''
	package �packname�;
	�FOR imp : config.imports�
	import �imp.name�
	�ENDFOR�
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.PriorityQueue;
	
	
	class Graph extends PipeStages{
		private ArrayList<Edge> edges = new ArrayList<Edge>();
		private HashMap<String,Component> nodes = new HashMap<String,Component>();
		private PriorityQueue<Component> components = new PriorityQueue<Component>();		
		
		public void addEdge(String from, String pfrom, String to, String pto){
			Component csource = nodes.get(from);
			Component ctarget = nodes.get(to);
			
			Port source = csource.getPort(pfrom);
			Port target = ctarget.getPort(pto);
			Edge edge = new Edge(source, target);
			edges.add(edge);
			ctarget.checkLevel(csource);
		}
		
		public Graph() {
			�FOR instance : config.instances�
				nodes.put("�instance.name�", new �instance.component.name�("�instance.name�"));
				components.add(nodes.get("�instance.name�"));
			�ENDFOR�
			�FOR t : config.transitions�
				addEdge("�t.source.name�","�t.targetPort.name�","�t.target.name�","�t.sourcePort.name�");
			�ENDFOR�
			
		}
		public void invoke(){
			 for(Component c: components) {
				 c.invoke();
			 }
		}
	}

		
	'''
}
