package com.fmapps.finalproject_techstudentapp;

import java.util.ArrayList;



import android.app.Activity;
import android.content.Intent;

import android.graphics.Typeface;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizContent extends Activity {
	int total=0, rightAnswer=0;
	ImageView imgcheck; 
	Intent i;
	final int result = 1;
	
	boolean flag=false;
	final ArrayList<RadioButton> listOfRadioButtons = new ArrayList<RadioButton>();
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	                                // BEGINNING OF COMPUTER SCIENCE ILLUMINATED MATERIAL
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankCSICh1= {"1. a word processing program that allows the user to enter and edit text.", 
            "2. assembly language is a made up of mnemonic codes that represent ________.",
            "3. An assembler translates assembly-language programs into______.",
            "4. _______ is a mental model that removes complex details", 
            "5. A human operator is too slow. Everything application had to be accessed by the user writing it in. Therefore the computer was idle while the human prepared the next program to be run. The computer has the speed to organize itself. What Question does this statement answer?",
            "6. Machine language is built into the electrical circuitry of a computer. Assembly language is made up of mnemonic codes that represent machine-language instructions. What Question does this statement answer?",
            "7. puts a program's instructions into memory where they can be executed.",
            "8. A protocol is a code prescribing strict adherence to correct etiquette and procedure (as in a diplomatic exchange). Computing terminology has borrowed the word to describe the correct etiquette for computers to use when communicating with one another.",
            "9. _____ puts a program's instructions into memory where they can be executed.",
            "10. Which of these doesn't belong to the four areas in which the practitioner must be skilled?"}, 
	           
            answerBankCSICh1 = {"Linker", "Loader", "Editor"/*correct*/, "Writer", 
                    "machine-language"/*correct*/, "high-language", "java language","assembly-language",
                    "intermediate language", "machine-code"/*correct*/, "high-language", "english-like statements",
                    "Abstraction"/*correct*/, "Illusion", "Imagination", "Emulation",
                    "Name the four areas in which the practitioner must be skilled.", "Define the word abstraction.", "What constitutes systems software?", "What was the rationale behind the development of operating systems?"/*correct*/,
                    "Distinguish between an assembler and a compiler.", "Distinguish between a systems programmer and an applications programmer.", "Distinguish between assembly language and high-level languages.","Distinguish between binary-code and assembly language."/*correct*/,
                    "Abstraction.", "Loader"/*correct*/, "Editor", "Linker",
                    "Name the four areas in which the practitioner must be skilled.", "Distinguish between an assembler and a compiler.", "Define the word abstraction.","Define the word protocol and explain how it is used in computing."/*correct*/,
                    "Linker", "Coordinator", "Loader"/*correct*/, "Builder",
                    "Algorithmic thinking", "representation (of data storage)", "Accounting"/*correct*/, "design."};
	int[] rightAnswerCSICh1 = {3,1,2,1,4,4,2,4,3,3};
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	String[] questionBankCSICh2= {"1. A digit in the binary number system; a 0 or a 1.", 
            "2. A natural number, a negative of a natural number, or zero.",
            "3. A system of expressing numbers in which the digits are arranged in succession, the position of each digit has a place value, and the number is equal to the sum of the products of each digit by its place value.",
            "4. An integer or the quotient of two integers (division by zero excluded).", 
            "5. The foundational value of a number system, which dictates the number of digits and the value of digit positions.",
            "6. A unit of an abstract mathematical system subject to the laws of arithmetic.",
            "7. Eight binary digits.",
            "8. Binary digit.",
            "9. The number 0 and any number obtained by repeatedly adding 1 to it.",
            "10. The number of bits in a word is called"}, 
	           
            answerBankCSICh2 = {"Byte", "Bit"/*correct*/, "Short", "Octet", 
                    "Natural number", "Decimal", "Integer"/*correct*/,"Rational number",
                    "intermediate language", "Positional Notation"/*correct*/, "high-language", "english-like statements",
                    "rational number"/*correct*/, "quotient number", "real number", "decimal",
                    "base"/*correct*/, "root", "origin", "binary",
                    "digit", "decimal", "number"/*correct*/,"zero",
                    "bait", "bit", "bite", "byte"/*correct*/,
                    "Bit"/*correct*/, "Byte", "Bite", "Float",
                    "Rational number", "Integer", "Decimal","Natural number."/*correct*/,
                    "Word width", "Word length"/*correct*/, "Word dimention", "Word scope"};
	int[] rightAnswerCSICh2 = {2,3,2,1,1,3,4,1,4,2,3};
	
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	String[] questionBankCSICh3= {"1. Number representation in which the sign represents the ordering of the number (negative and positive) and the value represents the magnitude", 
            "2. The act of breaking information down into discrete pieces",
            "3. Movie compression technique based on differences between consecutive frames",
            "4. Data that has been organized or processed in a useful manner", 
            "5. Reducing the amount of space needed to store a piece of data",
            "6. A data compression technique in which there is loss of information",
            "7. Replacing a frequently used word with a single character",
            "8. The condition that occurs when the results of a calculation are too large to represent in a given machine",
            "9. Storing image information pixel by pixel",
            "10. Replacing a long series of repeated characters with a count of the repetition"}, 
	           
            answerBankCSICh3 = {"Signed Representation", "Signed-Magnitude Representation"/*correct*/, "Magnitude Representation", "Code-Representation", 
                    "Digitize"/*correct*/, "Analyze", "Loop","Compress",
                    "Dimentional Compression", "Frame Compression", "Graphic Compression", "Spatial Compression"/*Correct*/,
                    "Information"/*correct*/, "Folder", "Compressed Files", "Program",
                    "Data Expansion.", "Data Minimisation.", "Data Compression"/*Correct*/, "Data Fragmetation",
                    "Spatial Compression.", "Lossless Compression.", "Lossy Compression."/*correct*/,"Data Compression.",
                    "Vector Graphics.", "Run-length Encoding", "Keyword Encoding"/*correct*/, "Huffman Encoding",
                    "Resolution.", "Overflow."/*correct*/, "Pixels.","Reclock.",
                    "Data Compression", "Radix Point", "Vector Graphics", "Raster-graphics format"/*correct*/,
                    "Huffman Encoding", "Floating Point", "Run-length Encoding"/*correct*/, "Keyword Encoding"};
	int[] rightAnswerCSICh3 = {2,1,4,1,3,3,3,2,4,3};
	
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	String[] questionBankCSICh4= {"1. A circuit that uses a few input control signals to determine which of several input data lines is routed to its output.", 
            "2. A device that performs a basic operation on electrical signals, accepting one or more input signals and producing a single output signal.",
            "3. A combination of interacting gates designed to accomplish a specific logical function.",
            "4. A piece of silicon on which multiple gates have been embedded", 
            "5. An electronic circuit that performs an addition operation on binary values",
            "6. The same output for each corresponding input-value combination for two circuits",
            "7. Material such as silicon that is neither a good conductor nor a good insulator.",
            "8. A mathematical notation for expressing two-valued logical functions",
            "9. A table showing all possible input values and the associated output values",
            "10. A device that acts either as a wire or a resister, depending on the voltage level of an input signal"}, 
	           
            answerBankCSICh4 = {"Converter", "Multiplexer"/*correct*/, "Compressor", "USB", 
                    "Gate"/*correct*/, "Port", "Transistor","Permutator",
                    "Line", "Cable", "System", "Circuit"/*correct*/,
                    "Integrated Circuit (chip)"/*correct*/, "Processor", "Transistor", "Port",
                    "Linker", "Adder"/*correct*/, "Assembler", "Transistor",
                    "Multiplexer", "Circuit Equivalence"/*correct*/, "Circuit", "Truth Table",
                    "Semiconductor"/*correct*/, "Transistor", "Circuit","Full adder",
                    "Full adder", "Boolean Algebra"/*correct*/, "Half Adder", "Logic Diagram",
                    "Transistor Table", "Full adder Table", "Truth Table"/*correct*/,"Gate Table",
                    "Adder", "Gate", "Transistor"/*correct*/, "Circuit"};
	int[] rightAnswerCSICh4 = {2,1,4,1,2,2,1,2,3,3};
	
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	String[] questionBankCSICh5= {"1. The time it takes for the read/write head to get positioned over the specified track", 
            "2. The register that contains the instruction currently being executed",
            "3. The computer component that controls the actions of the other components so as to execute instructions in sequence",
            "4. The main circuit board of a personal computer", 
            "5. A technique that breaks an instruction into smaller steps that can be overlapped",
            "6. The rate at which data moves from the disk to memory",
            "7. The central processing unit, a combination of the arithmetic/logic unit and the control unit; the 'brain' of a computer that interprets and executes instructions",
            "8. The computer component that performs arithmetic operations (addition, subtraction, multiplication, division) and logical operations (comparison of two values)",
            "9. The time it takes for the specified sector to be in position under the read/write head",
            "10. The number of bits that can be transferred in parallel over the bus"}, 
	           
            answerBankCSICh5 = {"Frequency", "Read/Write Time", "Access Time","Seek Time"/*correct*/,
            "Main Register (MR)", "Instruction Register (IR)"/*correct*/, "RAM", "EXE Register",
            "Control Unit"/*correct*/, "Logic Arithmetic Unit", "RAM","Device Manager",
            "Motherboard"/*correct*/, "CPU", "Control Unit", "Logical Arithmetics Unit",
            "Compiling", "Programming", "Pipelining"/*correct*/, "Breaking",
            "Transfer rate"/*correct*/, "Seek Time", "Sector Time", "Access Time", 
            "Output Unit", "Input Unit", "CPU"/*correct*/, "Control Unit",
            "ALU"/*correct*/, "CPU", "Control Unit","Program Counter",
            "Frequency", "Read/Write Time", "Access Time","Latency"/*correct*/,
            "Bus width"/*correct*/, "Bandwidth", "Frequency", "Transfer Rate"};
	int[] rightAnswerCSICh5 = {4,2,1,1,3,1,3,1,4,1};
	
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	String[] questionBankCSICh67= {"1. Algorithms that order the items in the collection based on the sort key", 
            "2. A hypothetical machine designed to contain the important features of a real computer that we want to illustrate",
            "3. One low-level task",
            "4. Develop algorithm; Test algorithm", 
            "5. A virtual computer designed by Stanley Warford that has 39 machine-language instructions",
            "6. A sorting algorithm that sequentially removes an item from a list and adds it back to the list in the appropriate position relative to the previous items in the list.",
            "7. Printing a value on an output device Write, Print",
            "8. A program that behaves just like the Pep/8 virtual machine behaves",
            "9. The practice of hiding the details of a module with the goal of controlling access to it",
            "10. A language that permits the user to enter mnemonic codes for each instruction rather than binary numbers"}, 
	           
            answerBankCSICh67 = {"Sorting", "Sorting algorithms"/*correct*/, "Ordering algorithm", "Testing Programs", 
                    "Virtual computer"/*correct*/, "Pseudocode", "Abstract Step","General case",
                    "Machine-language Programs", "Pep/8 One Register (A) and two-part instructions", "How many low-level tasks can each machine language instruction perform?"/*correct*/, "Characteristics of machine language:",
                    "Subprogram Statements", "Sorting algorithms", "Code coverage", "Algorithm Development Phase"/*correct*/,
                    "Recursion", "Output", "Pep/8"/*correct*/, "Computer",
                    "Insertion Sort"/*correct*/, "Program", "Java","Built-In Algorithm",
                    "Outcome", "Output"/*correct*/, "Result", "Display",
                    "Pep8/Generator", "Pep8/Renderer", "Pep8/Simulator"/*correct*/,"Pep8/Emulator",
                    "Information Compiling", "Information Covering", "Information Hiding"/*correct*/, "Information Coding",
                    "Pep/8 Code Language", "Pep/8 Assembly Language"/*correct*/, "Pep/8 Compiling Language", "Pep/8 Hiding Language"};
	int[] rightAnswerCSICh67 = {2,1,3,4,3,1,2,3,3,2};
	
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankCSICh8= {"1. A sequence of vertices that connects two nodes in a graph", 
            "2. A container whose properties (data and operations) are specified independently of any particular implementation",
            "3. A mechanism for communicating between two parts of a program",
            "4. An implementation of a container where the items are stored together with information on where the next item can be found", 
            "5. A graph in which each edge is directed from one vertex to another (or the same) vertex",
            "6. The identifiers listed in parenthesis beside the subprogram name",
            "7. A parameter that expects a copy of its arguments to be passed by the unit (put on the message board)",
            "8. A graph in which the edges have no direction",
            "9. The unique starting node in a tree",
            "10. A tree node that has no children"}, 
	           
            answerBankCSICh8 = {"Graph", "Path"/*correct*/, "Vertex", "Root", 
                    "Undirected Graph", "Edge (arc)", "Adjacent Vertices","Abstract data type (ADT)"/*correct*/,
                    "Parameter list"/*correct*/, "Arguments", "Path", "Parameters",
                    "Linked structure"/*correct*/, "Binary Tree", "Edge (arc)", "Data Structure",
                    "Directed graph (digraph)"/*correct*/, "Graph", "Edge (arc)", "Undirected Graph",
                    "Variables", "Parameters"/*correct*/, "Arguments", "Functions",
                    "Value Parameter"/*correct*/, "Argument Parameter", "Copy Parameter","Container Parameter",
                    "Unedged Graph", "Undirected Graph"/*correct*/, "Unformatted Graph", "Undefined Graph",
                    "Root"/*correct*/, "Origin", "Header", "Base",
                    "Lonely Node", "Sterile Node", "Leaf Node"/*correct*/, "Fruit Node"};
	int[] rightAnswerCSICh8 = {2,4,1,1,1,2,1,2,1,3};
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankCSICh9= {"1. The ability of a language to have duplicate method names is an inheritance hierarchy and to apply the method that is appropriate for the object to which the method is applied", 
            "2. A program that inputs a program in a high-level language and directs the computer to perform the actions specified in each statement",
            "3. A word in a language that has special meaning",
            "4. A description of a group of objects with similar properties and behaviors", 
            "5. Named items in a class",
            "6. An instruction that determines the order in which other instructions in a program are executed",
            "7. A program that translates a high-level language program into machine code",
            "8. A statement that associates an identifier with a variable, an action, or some other entity within the language that can be given a name so that the programmer can refer to that item by name",
            "9. A pattern for an object",
            "10. A language feature that enforces information hiding"}, 
	           
            answerBankCSICh9 = {"Declaration", "Polymorphism"/*correct*/, "Compiler", "Method", 
                    "Interpreter"/*correct*/, "Bytecode", "Inheritance","Instantiate",
                    "Method", "Case Sensitive", "Interpreter", "Reserved Word"/*correct*/,
                    "Objects", "Encapsulation", "Object class (class)"/*correct*/, "Declaration",
                    "Fields"/*correct*/, "Variables", "Bytecodes", "Domains",
                    "Architecture","Command Set", "Control Structure"/*correct*/,"System Structure",
                    "Renderer", "Compressor", "Builder", "Compiler"/*correct*/,
                    "Header", "Declaration"/*correct*/, "Command","Instruction",
                    "Class (Implementation Phase)"/*correct*/, "Object (Implementation Phase)", "Method (Implementation Phase)", "Variable (Implementation Phase)",
                    "Hiding", "Compiling", "Code", "Encapsulation"/*correct*/};
	int[] rightAnswerCSICh9 = {2,1,4,3,1,3,4,2,1,4};
	
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankCSICh10= {"1. The mapping from a logical address to a physical address", 
            "2. The memory management technique in which memory is divided into partitions as needed to accommodated programs",
            "3. Programs that help us solve real-world problems",
            "4. System software that manages computer resources and provides an interface for system interaction", 
            "5. A system in which CPU time is shared among multiple interactive users at the same time",
            "6. A large, multiuser computer often associated with early timesharing systems",
            "7. A reference to a stored value relative to the program making the reference",
            "8. CPU scheduling that occurs when the currently executing process gives up the CPU voluntarily",
            "9. The memory management techinque in which memory is divided into a specific number of partitions into which programs are loaded",
            "10. The dynamic representation of a program during execution"}, 
	           
            answerBankCSICh10 = {"Thrashing", "Binding"/*correct*/, "Timesharing", "Demand paging", 
                    "Dynamic-partition technique"/*correct*/, "Paged memory technique", "Application Software",
                    "Application Software"/*correct*/, "Process states", "System software", "Operating System",
                    "Operating System"/*correct*/, "Process states", "Real-time system", "Time slice",
                    "Thrashing", "Timesharing"/*correct*/, "Time slice","Demand paging",
                    "Super Computer", "Modulator", "Mainframe"/*correct*/, "Micro Computer",
                    "Cell Address", "Logical Address"/*correct*/, "RAM Address", "CPU Address",
                    "Preemptive Scheduling", "Page Scheduling", "Priority Scheduling","Non-Preemptive Scheduling"/*correct*/,
                    "Dynamic Partition", "Fixed Partition"/*correct*/, "Load Partition", "Divide Partition",
                    "Process"/*correct*/, "Dynamic Partition", "Fixed Partition", "Thread"};
	int[] rightAnswerCSICh10 = {2,1,1,1,2,3,2,4,2,1};
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankCSICh13= {"1. A ______ is made up of sensors, actuators, and computational elements( (microprocessors).", 
            "2. The first formal instantiation of the Turing test, held annually",
            "3. The equality of two systems based on their results",
            "4. Using a computer to recognize the words spoken by a human", 
            "5. Using a computer to create the sound of human speech",
            "6. The ambiguity created when pronouns could be applied to multiple objects",
            "7. The ambiguity created when sentences can be constructed in various ways",
            "8. A software system based on the knowledge of human experts",
            "9. Software that uses a specific set of information",
            "10. The process of adjusting the weights and threshold values in a neural net to get a desired outcome"}, 
	           
            answerBankCSICh13 = {"Robot"/*correct*/, "Device", "Antenna", "Program", 
                    "Voiceprint", "Search tree", "Loebner prize"/*correct*/,"Expert system",
                    "Strong Equivalence", "Weak equivalence"/*correct*/, "Average Equivalence", "Non-Equivalence",
                    "Voice Recognition"/*correct*/, "Voice synthesis", "Human Translator", "Voice Compiling",
                    "Voice Recognition", "Voice Mixing", "Voice Composition", "Voice synthesis"/*correct*/,
                    "Voiceprint", "Lexical ambiguity", "Syntactic ambiguity","Referential ambiguity"/*correct*/,
                    "Lexical ambiguity", "Syntactic ambiguity"/*correct*/, "Voiceprint", "Referential ambiguity",
                    "Algorithm based system", "Code based System", "Rule-based system"/*correct*/,"Expert System",
                    "Algorithm based system", "Knowledge-based system"/*correct*/, "Rule-based system", "Code based System",
                    "Training"/*correct*/, "Coding", "Programming", "Testing"};
	int[] rightAnswerCSICh13 = {1,3,2,1,4,4,2,3,2,1};
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankCSICh14= {"1. The type of interactions and experiences a player has during the game", 
            "2. The attempt to produce models of three-dimensional protein structures that have yet to be found experimentally",
            "3. Developing a model of a complex system and experimenting with the model to observe the results",
            "4. the deciphering of genome sequences.", 
            "5. he modeling of molecules",
            "6. A software system within which computer games are created",
            "7. An interdisciplinary field that applies technique of computer science, applied mathematics, and statistics to problems in biology",
            "8. An abstraction of a real system; a representation of objects within a system and the rules that govern the behavior of the objects",
            "9. A computer simulation of a virtual world",
            "10. The application of information technology to molecular biology"}, 
	           
            answerBankCSICh14 = {"model", "Game play"/*correct*/, "Game Engine", "Simulation", 
                    "Computer Gaming", "Bioinformatics", "Molecular modeling","Protein structure prediction"/*correct*/,
                    "model", "Game play", "Game Engine", "Simulation"/*correct*/,
                    "Computer Gaming", "Computational biology", "Computational biomodeling", "Computational genomics"/*correct*/,
                    "Molecular modeling"/*correct*/, "Molecular Cyphering", "Molecular Design", "Molecular Programming",
                    "Game System", "Game Console", "Game Emulator","Game Engine"/*correct*/,
                    "Biology Modeling", "Biology Simulation", "Computational biology"/*correct*/, "Programmable Biology",
                    "Model"/*correct*/, "Simulation", "Emulation","Program",
                    "Computer Emulation", "Computer Design", "Computer Gaming"/*correct*/, "Emulation",
                    "Bioinformatics"/*correct*/, "Biology Simulation", "Computational biology", "Biology Modeling"};
	int[] rightAnswerCSICh14 = {2,4,4,4,1,4,3,1,3,1};
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankCSICh15= {"1. A network connection made without physical wires", 
            "2. A program that shows the route a packet takes across the Internet",
            "3. An alternative to TCP that achieves higher transmission speeds at the cost of reliability",
            "4. A set of rules that defines how data is formatted and processed on a network", 
            "5. A gateway machine and its software that protects a network by filtering the traffic it allows",
            "6. A company providing access to the Internet",
            "7. An Internet connection made using a digital signal on regular phone lines",
            "8. A distributed approach in which a client makes requests of a server and",
            "9. Layers of protocols that build and rely on each other",
            "10. A collection of computing devices connected so that they can communicate and share resources"}, 
	           
            answerBankCSICh15 = {"Firewall", "Ethernet", "Wireless"/*correct*/, "Port", 
                    "Ethernet", "Internet", "Router","Traceroute"/*correct*/,
                    "Internet Protocol (IP)", "User Datagram Protocol (UDP)"/*correct*/, "nternet service provider (ISP)", "Transmission Control Protocol (TCP)",
                    "Port", "Protocol stack", "Router", "Protocol"/*correct*/,
                    "Gateway", "Wireless", "Firewall"/*correct*/, "Port",
                    "Internet Protocol (IP)", "User Datagram Protocol (UDP)", "Internet backbone","Internet service provider (ISP)"/*correct*/,
                    "Digital subscriber line (DSL)"/*correct*/, "Client/server model", "Local-area network", "Wide-area network",
                    "File server", "Client/server model"/*correct*/, "Phone modem","Cable modem",
                    "Bus topology", "Protocol stack"/*correct*/, "Router", "Protocol",
                    "Computer network"/*correct*/, "Internet", "Router", "Ethernet"};
	int[] rightAnswerCSICh15 = {3,4,2,4,3,4,2,2,2,1};
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
						                     //END OF COMPUTER SCIENCE ILLUMINATED 
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/	
	                                               //Problem Solving (Alice)
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	String[] questionBankPS13= {"1. combining two strings a and b into a single string", 
            "2. message sent to object to get information (proximity, point of view, etc.)",
            "3. sequence of steps that solve a problem",
            "4. pair of opposite-facing arrows that represent a spatial dimension", 
            "5. part of a scene that is filmed from a particular camera position",
            "6. combined position and orientation",
            "7. combined yaw, pitch, and roll",
            "8. one part of a story",
            "9. how much of the object is drawn",
            "10. location by 3 axes, lr, ud, fb"}, 
	           
            answerBankPS13 = {"function", "concatenation"/*correct*/, "position", "orientation", 
                    "position", "flow", "orientation","function"/*correct*/,
                    "argument", "shot", "position", "algorithm"/*correct*/,
                    "flow", "class", "axis"/*correct*/, "shot",
                    "scene", "flow", "shot"/*correct*/, "axis",
                    "point of view"/*correct*/, "position", "skinTexture","pointOfView",
                    "point of view.", "orientation"/*correct*/, "pointOfView", "position",
                    "shot", "message", "scene"/*correct*/,"dummy",
                    "fillingStyle"/*correct*/, "vehicle", "opacity", "skinTexture",
                    "function", "position"/*correct*/, "pose", "method."};
	int[] rightAnswerPS13 = {2,4,4,3,3,2,2,3,1,2};
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankPS4= {"1. a statement which runs the inside code if a condition is met.", 
            "2. an indefinite loop, which runs the internal code as long as a certain value remains on true.",
            "3. the order in which a program's statements run.",
            "4. a variable with two possible values—true and false. It is useful when the program needs to make decisions.", 
            "5. operators which produce a Boolean value from two input values (e.g. val1 && val2).",
            "6. a loop is a statement which allows for internal code to be repeated.",
            "7. a chart which uses arrows to indicate possible directions of flow.",
            "8. the logic of if and else statements: if the code inside the if is not run, then the code inside the else is.",
            "9. a loop that repeats a definite amount of times—the for loop.",
            "10. a statement which makes the program wait for a specified duration."}, 
	           
            answerBankPS4 = {"wait() statement", "while statement", "if statement"/*correct*/,"nested statement",
			        "while statement"/*correct*/, "wait() statement", "nested statement", "if statement",
			        "control structure"/*correct*/, "condition", "Boolean type", "counting loop",
                    "Boolean expressions", "Boolean variables", "Boolean type"/*correct*/, "Boolean operators",
                    "Boolean operators"/*correct*/, "Define", "What", "What",
                    "General Loop"/*correct*/, "Boolean type", "Boolean variables","Boolean expressions",
                    "flow control", "flow diagram"/*correct*/, "Boolean type","condition",
                    "indefinite loop", "if-then-else logic"/*correct*/, "inifinite loop", "general loop",
                    "inifinite loop.", "indefinite loop", "general loop", "counting loop"/*Correct*/,
                    "while statement", "wait() statement"/*correct*/, "nested statement", "if statement"};
	int[] rightAnswerPS4 = {3,1,1,3,1,1,2,2,4,2};
	
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankPS5= {"1. a method that does very little other than organizing the calls to other methods", 
            "2. interaction between the computer application and the user",
            "3. writing a method and then testing it; writing an additional method and then testing it",
            "4. periodic checks that make sure what has been coded so far is working as expected", 
            "5. a placeholder so that you can use the same method over and over with different values or objects.",
            "6. a keyboard stroke that is connected by coding an event.",
            "7. a mouse click or mouse movement is connected by coding an event",
            "8. something that happens, such as a mouse click or keyboard stroke that calls code during the execution of a computer program",
            "9. a method that is called when the user does something such as a mouse click on an object or a keyboard press during the execution of a computer program",
            "10. giving directions to an object during run time through the keyboard, mouse or other input devise."}, 
	           
            answerBankPS5 = {"event", "testing", "parameter", "driver"/*correct*/, 
                    "interaction", "interactive"/*correct*/, "testing","driver",
                    "interaction", "parameter", "interactive", "incremental development"/*correct*/,
                    "Testing"/*correct*/, "Trying", "Executing", "Emulating",
                    "event", "testing", "parameter"/*correct*/, "driver", 
                    "Method Control", "Event Control", "Key Control", "Keyboard Control"/*correct*/, 
                    "Method Control", "Event Control", "Key Control", "Mouse Control"/*correct*/,
                    "Method Control", "Mouse Control", "Event"/*correct*/, "Key Control",
                    "event handling function", "event handling method"/*correct*/, "event handling variable", "event handling parameter",
                    "Interaction"/*correct*/, "Event Creation", "Event Control", "Directing"};
	int[] rightAnswerPS5 = {4,2,4,1,3,4,4,3,3,1};
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankPS6= {"1. Acting like a basket to receive information that is sent to a procedure", 
            "2. The action of creating and displaying an object from a class",
            "3. The inverse of Greater than",
            "4. The inverse of Less than", 
            "5. A program where the user guides objects or makes things happen in the program by using a key-listener or mouse-listener",
            "6. Makes a collection of instructions run at the same time",
            "7. Helps organise large programs by breaking down the coding into small manageable pieces",
            "8. The concept of thinking about an overall task instead of focusing on ll the small actions needed to complete the task",
            "9. The inverse of Equal to",
            "10. Information about a world and its objects are stored here"}, 
	           
            answerBankPS6 = {"Parameter"/*correct*/, "Method", "Properties", "argument", 
                    "boolean", "Functions", "Instantiating"/*correct*/,"Abstraction",
                    "<", "<="/*correct*/, "=", "<<",
                    ">="/*correct*/, ">", "=>", "=",
                    "Event Handler", "Instantiating", "Parameter","Interactive Program"/*correct*/,
                    "Do together"/*correct*/, "Parameter", "Method", "Do in order",                    
                    "Interactive Program.", "Object-oriented Programming"/*correct*/, "Class-level Procedure", "Instantiating",
                    "Functions", "argument", "Abstraction"/*correct*/,"Instantiating",
                    "!="/*correct*/, "> && <", "<>", "><",
                    "Variables", "Properties"/*correct*/, "Functions", "Events"};
	int[] rightAnswerPS6 = {1,3,2,1,4,1,3,3,1,2};
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankPS7= {"1. A while event is often called a BDE event. What does BDE stand for? ", 
            "2. Both the If statement and Loop statement are considered to be _________ statements.",
            "3. When actions are made to happen again and again by running an animation instruction (or a method) more than once",
            "4. A ________loop is a loop that is placed inside another loop.", 
            "5. It runs until a certain condition is met. for this reason, a while loop is called an ________________loop.",
            "6. What is the difference in an if statement and a while statement? ",
            "7. A loop that continues without stopping is called an ______ loop.",
            "8. A loop might be set to repeat a known number of times. for this reason, we sometimes call it a ______ loop or ________ loop.",
            "9. The Boolean condition used for entry into a while statement is the same as used in an ____statement.",
            "10. The count in a loop must be a ________ number or infinity."}, 
	           
            answerBankPS7 = {"Begin, Do, End", "Begin, During, End"/*correct*/, "Begin, Define, End", "Begin, Delete, End", 
                    "conditional", "control"/*correct*/, "could","loop",
                    "definite, counted", "Repetition Statements"/*correct*/, "positive", "conditional",
                    "if", "sub", "nested"/*correct*/, "semi",
                    "definite, counted", "conditional", "indefinite or conditional"/*correct*/, "infinite",
                    "The instructions in an if statement happen only once if the condition is true. The instructions in a while loop are repeated as long as the condition remains true."/*correct*/, "The instructions in an if statement are repeated if the condition is true. The instructions in a while loop happens once if the condition is true.", "The instructions in an if statement happen only once if the condition is true. The instructions in a while loop are repeated as long as the condition remains false.","The instructions in an if statement happen only once if the condition is false. The instructions in a while loop are repeated as long as the condition remains true.",
                    "Unstoppable", "Unlimited", "Indefinite", "Infinite"/*correct*/,
                    "definite, counted"/*correct*/, "undefinite, counted", "definite, uncounted","undefinite, uncounted",
                    "if"/*correct*/, "nested", "do", "why",
                    "even", "negative", "positive"/*correct*/, "odd"};
	int[] rightAnswerPS7 = {2,2,3,3,3,1,4,2,1,3};
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankPS8= {"1. a number that includes values to the left and right of a decimal point.", 
            "2. a group of pre-defined classes that can be used to build a program. The Java API organizes Java's classes by package.",
            "3. the set of whole numbers = {...-3, -2, -1, 0, 1, 2, 3...}.",
            "4. a number made up of some pattern of 0s and 1s.", 
            "5. an operation that adds one to the value of a variable.",
            "6. a type that is made up of 8 bits.",
            "7. a particular value of any type",
            "8. a type that uses 32 bits to represent a real number. A float type has less capacity than a double type.",
            "9. a number with a fixed decimal point; e.g., -1.5 and 3.5.",
            "10. an instance of a class."}, 
	           
            answerBankPS8 = {"remainder", "real number"/*correct*/, "char", "binary number", 
                    "API (application-programming interface)"/*correct*/, "fixed-point literals", "logical operator","operator precedence",
                    "increments", "bytes", "integers"/*correct*/, "doubles",
                    "real number", "remainder", "increment"/*correct*/, "binary number",
                    "increment"/*correct*/, "decrement", "quotient", "integers",
                    "int", "byte"/*correct*/, "base-2","bit",
                    "byte", "bit", "literal"/*correct*/, "integers",
                    "fixed-point literal", "API ", "assignment operator","float"/*correct*/,
                    "literal", "fixed-point literals"/*correct*/, "integers", "read-only items",
                    "parameter", "function", "variable", "object."/*correct*/};
	int[] rightAnswerPS8 = {2,1,3,3,1,2,3,4,2,4};
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
                                                 //END OF PROBLEM SOLVING
   /*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/	

	String[] questionBankPS0= {"1. text", 
            "2. ________",
            "3. ______",
            "4. _______", 
            "5. answer",
            "6. answer",
            "7. executed",
            "8. another",
            "9. _____",
            "10. skilled"}, 
	           
            answerBankPS0 = {"Linker", "Loader", "Editor"/*correct*/, "Writer", 
                    "machine"/*correct*/, "high", "java","assembly",
                    "intermediate", "machine"/*correct*/, "high", "english",
                    "Abstraction"/*correct*/, "Illusion", "Imagination", "Emulation",
                    "Name", "Define", "What", "What"/*correct*/,
                    "Distinguish", "Distinguish", "Distinguish","Distinguish"/*correct*/,
                    "Abstraction.", "Loader"/*correct*/, "Editor", "Linker",
                    "Name", "Distinguish", "Define","Define"/*correct*/,
                    "Linker", "Coordinator", "Loader"/*correct*/, "Builder",
                    "Algorithmic", "representation", "Accounting"/*correct*/, "design."};
	int[] rightAnswerPS10 = {3,1,2,1,4,4,2,4,3,3};
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	String[] questionBankPS00= {"1. text", 
            "2. ________",
            "3. ______",
            "4. _______", 
            "5. answer",
            "6. answer",
            "7. executed",
            "8. another",
            "9. _____",
            "10. skilled"}, 
	           
            answerBankPS00 = {"Linker", "Loader", "Editor"/*correct*/, "Writer", 
                    "machine"/*correct*/, "high", "java","assembly",
                    "intermediate", "machine"/*correct*/, "high", "english",
                    "Abstraction"/*correct*/, "Illusion", "Imagination", "Emulation",
                    "Name", "Define", "What", "What"/*correct*/,
                    "Distinguish", "Distinguish", "Distinguish","Distinguish"/*correct*/,
                    "Abstraction.", "Loader"/*correct*/, "Editor", "Linker",
                    "Name", "Distinguish", "Define","Define"/*correct*/,
                    "Linker", "Coordinator", "Loader"/*correct*/, "Builder",
                    "Algorithmic", "representation", "Accounting"/*correct*/, "design."};
	int[] rightAnswerPS00 = {3,1,2,1,4,4,2,4,3,3};
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    // BEGINNING OF PROGRAMMING FUNDAMENTALS (JAVA)
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
String[] questionBankPF14= {"1. Default", 
"2. Syntax",
"3. A stream of binary numbers",
"4. sentinel", 
"5. JOptionPane",
"6. Java Virtual Machine",
"7. nextDouble",
"8. //",
"9. /**",
"10. Bits",
"11. Loop Control Variable",
"12. logical operator",
"13. Posttest",
"14. Nested if-statement",
"15. Pretest",
"16. Boolean expression",
"17. What will the println statement in the following program segment display?\n"+"int x = 5;\n"+"System. out. println( x++);",
"18. The Equals Method",
"19. PrintWriter",
"20. Secondary Storage"}, 

answerBankPF14 = {"This is an empty statement that does nothing.", "This is an if statement that appears inside another if statement.", "This section of a switch statement is branched to if none of the case expressions match the switch expression."/*correct*/, "This is a named storage location in the computer's memory.", 
"These are the rules that must be followed when writing a program."/*correct*/, "This is a variable that keeps a running total.", "A variable must be declared before it can be used.","Variable names may begin with a number.",
" The Java compiler generates __________.", "Every complete statement ends with a __________.", "If you were to look at a machine language program, you would see _________."/*correct*/, "The negation operator is __________.",
"This is a boolean variable that signals when some condition exists in the program.", "This is a variable that controls the number of iterations performed by a loop.", "This is an if statement that appears inside another if statement.", "This is a special value that signals when there are no more items from a list of items to be processed. This value cannot be mistaken as an item from the list."/*correct*/,
" A byte is made up of eight", "The for loop is this type of loop.", "The do - while loop is this type of loop.","You can use this class to display dialog boxes."/*correct*/,
"The Java compiler generates __________.", "JVM stands for __________."/*correct*/, "The negation operator is __________.", "&& , || , and ! are __________.",
"Which Scanner class method would you use to read a double as input?"/*correct*/, "This key word is used to declare a named constant.", "This class allows you to read a line from a file.", "Which Scanner class method would you use to read a string as input?",
"These characters mark the beginning of a multi- line comment.", "These characters mark the beginning of a documentation comment.", "These characters mark the beginning of a single- line comment."/*correct*/,"This class allows you to read a line from a file.",
"These characters mark the beginning of a documentation comment."/*correct*/, " These characters mark the beginning of a multi- line comment.", "What is each repetition of a loop known as?", "These characters mark the beginning of a single- line comment.",
"Each byte is assigned a unique", "A byte is made up of eight"/*correct*/, "The for loop is this type of loop.", "JVM stands for __________.",
"This is a boolean variable that signals when some condition exists in the program.","This is an if statement that appears inside another if statement.", "This is a variable that keeps a running total.", "This is a variable that controls the number of iterations performed by a loop."/*correct*/,
"JVM stands for __________.", "The negation operator is __________.", "&& , || , and ! are __________."/*correct*/, "> , < , and == are __________.",
"The for loop is this type of loop.", "The do - while loop is this type of loop."/*correct*/, "The while loop is this type of loop.", "A byte is made up of eight",
"This is an if statement that appears inside another if statement."/*correct*/, "The if statement is an example of a __________.", "This is a named storage location in the computer's memory.", "This is an empty statement that does nothing.",
"The negation operator is __________.", "The while loop is this type of loop."/*correct*/, "A byte is made up of eight", "The Java compiler generates __________.",
"This type of expression has a value of either true or false ."/*correct*/, "This type of loop always executes at least once.", "The do - while loop is this type of loop.", "The for loop is this type of loop.",
"4", "5"/*correct*/, "6", "error",
"This is an if statement that appears inside another if statement.", "This is an empty statement that does nothing.", "This determines whether two different String objects contain the same string."/*correct*/, "When determining whether a number is inside a range, it's best to use this operator.",
"To open a file for writing, you use the following class."/*correct*/, "The while loop is this type of loop.", "The do - while loop is this type of loop.", "To open a file for reading, you use the following classes.",
"This type of expression has a value of either true or false .", "This type of operator lets you manually convert a value, even if it means that a nar-rowing conversion will take place.", "This type of loop has no way of ending and repeats until the program is interrupted.", "This type of memory can hold data for long periods of time— even when there is no power to the computer."/*correct*/};
int[] rightAnswerPF14 = {3,1,3,4,4,2,1,3,1,2,4,3,2,1,2,1,2,3,1,4};
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
String[] questionBankPF48= {"1. This appears at the beginning of a method definition.", 
"2. An object is a( n) __________ of a class",
"3. This is a method that stores a value in a field or in some other way changes the value",
"4. When the value of an item is dependent on other data, and that item is not updated when the other data is changed, what has the value become?", 
"5. This is a method that is automatically called when an instance of a class is created.",
"6. When a local variable has the same name as a field, the local variable's name does this",
"7. This is automatically provided for a class if you do not write one yourself.",
"8. Two or more methods in a class may have the same name, as long as this is different.",
"9. The process of matching a method call with the correct method is known as ",
"10. Each element of an array is accessed by a number known as a( n) __________.",

"11. This array field holds the number of elements that the array has. ",
"12. This search algorithm steps through an array, comparing each item with the search value.",
"13. This search algorithm repeatedly divides the portion of an array being searched in half. ",
"14. To determine the number of items stored in an ArrayList object, you use this method. ",
"15. When an object is passed as an argument to a method, this is actually passed. ",
"16. If you write this method for a class, Java will automatically call it any time you con-catenate an object of the class with a string. ",
"17. This type of method cannot access any non- static member variables in its own class. ",
"18. This enum method returns the position of an enum constant in the declaration.",
"19. This is the name of a reference variable that is always available to an instance method and refers to the object that is calling the method. ",
"20. To insert an item at a specific location in an ArrayList object, you use this method. "}, 

answerBankPF48 = {"Linker", "Loader", "Header"/*correct*/, "Writer", 
"Instance"/*correct*/, "copy", "clone","representation",
"Compiler", "Constructor", "Editor", "Mutator"/*correct*/,
"OldDated", "Stale"/*correct*/, "Static", "Cast",
"Constructor"/*correct*/, "Builder", "Compiler", "Instantiator",
"Interprets", "Casts", "Shadows"/*correct*/,"Imitates",
"Default Method", "Default Constructor"/*correct*/, "Default Header", "Default return value",
"The variable names", "The return values", "The constructors","The Parameter list"/*correct*/,
"Binding"/*correct*/, "Bonding", "Linking", "Rooting",
"Rank", "Indicator", "Subscript"/*correct*/, "Position",

"Dimention", "Length"/*correct*/, "Width", "Size",
"Comparison Search", "Root Search", "Binary Search", "Sequencial Search"/*correct*/,
"Binary Search"/*correct*/, "Sequencial Search", "Root Search", "Comparison Search",
"scpope", "dimention", "size"/*correct*/, "length",
"A reference"/*correct*/, "An index", "A field", "A substitute",
"format", "addString", "Concat", "toString"/*correct*/,
"Static"/*correct*/, "Private", "Public", "final",
"index", "ordinal"/*correct*/, "const", "getConst",
"this"/*correct*/, "self", "me", "get",
"create", "group", "add"/*correct*/, "join",};
int[] rightAnswerPF48 = {3,1,4,2,1,3,2,4,1,3,2,4,1,3,1,4,1,2,1,3};

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
String[] questionBankPF811= {"1. To convert the integer vaiable, number = 56, to a string, use the following statement", 
"2. What will be printed after the following code is executed?\n\nString str = \"abc456\";\nint i = 0;\nwhile (1<6)\n{\nif(!Character.isLetter(str.charAt(i))\nSystem.out.println(Character.toUpperCase(charAt(i)));\ni++;\n}",
"3. If String str = \"ABCDEFGHI\", what will be returned from Character.toLowerCase(str.charAt(5))?",
"4. To concatenate two strings:", 
"5. In a string that contains a series of words or other items of data separated by spaces or other characters, the programming term for the data items is",
"6. If you do not specify delimiters in the StringToken constructor, which of the following cannot be a delimiter?",
"7. The _______ method accepts a value of any primitive data type as an argument and returns a string representation of the value.",
"8. What will be the value of loc after the following code is executed? \n\nint loc; \nString str = \"The cow jumped over the moon.\"\nloc = str.lastIndexOf(\"ov\",14);",
"9. which of the following statements will print the maximum value a double variable may have?",
"10. To convert the string, str = \"285.74\" to a double and store it in the variable x, use the following statement.",

"11. What does the following statement do?\n\nDouble number = new Double(8.8);",
"12. What will be printed after the after the following code is executed?\n\nString str = \"abc456\";\nint i = 0;\nwhile (1<6)\n{\nif(character.isLetter(str.charAt(i))\nSystem.out.println(Character.toUpperCase(charAt(i)));\ni++;\n}",
"13. Few programmers use wrapper classes because",
"14. The Character wrapper provides numerous methods for",
"15. An instance of a class does not have to exist in order for values to be stored in a class's _______ fields",
"16. What will be returned from a method, if the following is the method header:\n\npublic Rectangle getRectangle()",
"17. To compare two objects",
"18. If the this variable is used as a constructor call,",
"19. Look at the Following declaration:\n\nenum Tree { OAK, MAPLE, PINE }\n\nWhat is the ordinal value of the MAPLE enum constant?",
"20. The JVM periodically performs this process to remove unreferenced objects from memory.",}, 

answerBankPF811 = {"String str = number.toString();", "String str = Integer.toString(number);"/*correct*/, "String str = toString(number);", "String str = String(number);", 
"456"/*correct*/, "457", "458","459",
"e", "f"/*correct*/, "g", "h",
"Use ++ between them", "Use str1.add(str2);", "Use toString() between them", "Use the concat() method or use the + between the two Strings"/*correct*/,
"List", "Token"/*correct*/, "Phrase", "ArrayList",
"Semicolon"/*correct*/, "Braces", "Brackets","double quotes",
"toString()", "stringValue()", "valueOf()"/*correct*/, "concat",
"2", "1", "0", "-1"/*correct*/,
"System.out println(Double.MAX);", "System.out println(MAX_VALUE);", "System.out println(Double.MAX_VALUE);"/*correct*/, "System.out println(Double.MAXIM_VALUE);",
"double x = Double.parseDouble(str);", "double x = String.parseDouble(str);"/*correct*/, "double x = Double.parseDouble(x);", "String x = String.parseString(str);",
"It Creates a Double Object; It initializes that object to 8.8; It assigns the object's address to the number variable"/*correct*/,"It Creates a Double Class; It initializes that object to 8.8; It assigns the object's address to the number variable","It Creates a Double Object; It assigns the object's address to the number variable","It Creates a Double Object; It initializes that object to 8.8;",
"ABCC", "ACB", "BCA", "ABC"/*correct*/,
"they interfere with other data", "They are mutable, They are not easy to use", "They are immutable, They are not easy to use"/*correct*/, "they're trivial",
"Testing but not converting char variables", "Casting and using char variables", "Creating and deleting char variables", "Testing and converting char variables"/*correct*/,
"private", "static"/*correct*/, "public", "non-static",
"The address of an object in the class Rectangle"/*correct*/, "The address of a class in the object Rectangle", "An object in the class Rectangle", "A Class in the Object Rectangle",
"It is not possible, you can compare Classes but not Objects", "Write an isEqual() method between the objects", "Write an equals method that will make a field by field comparison of the two object"/*correct*/, "Write a == that will make a field by field comparison of the two object",
"Nothing will happen", "The code will be executed and the method will be used for recursion", "A compiler error will result, if it is not the first statement of the constructor"/*correct*/, "A compiler error will ultimately result",
"0", "1"/*correct*/, "2", "3",
"Garbage Collection"/*correct*/, "Memory Cleaning", "Memory Defragmentation", "Memory Swap",};
int[] rightAnswerPF811 = {2,1,2,4,2,1,3,4,3,2,1,4,3,4,2,1,3,3,2,1};

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/

TextView txtOut;
	boolean isPressed = false;
	int i1=1, j1=1, a1=0, check=0, length=999;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quizcontent);
		final Button btnContinue = (Button)findViewById(R.id.btnValidate);
		txtOut = (TextView)findViewById(R.id.txtQuiz);
		
		Typeface font = Typeface.createFromAsset(getAssets(), "asongforjennifer.ttf");
		txtOut.setTypeface(font);
		
		txtOut.setText("What follows is a series of questions. If you leave this Page your progress will not be saved. Click on \"Start\" Whenever you are ready.");
		imgcheck = (ImageView) findViewById(R.id.imgCheckAnswer);
		
		i = new Intent(this,FinalScore.class);
		RadioButton rad1 = (RadioButton) findViewById(R.id.radioButton1);
		RadioButton rad2 = (RadioButton) findViewById(R.id.radioButton2);
		RadioButton rad3 = (RadioButton) findViewById(R.id.radioButton3);
		RadioButton rad4 = (RadioButton) findViewById(R.id.radioButton4);
		rad1.setTypeface(font);
		rad2.setTypeface(font);
		rad3.setTypeface(font);
		rad4.setTypeface(font);
		final RadioGroup radgroup = (RadioGroup) findViewById(R.id.grpQuiz);
		int count = radgroup.getChildCount();
        
        for (int i=0;i<count;i++) {           // Loading the RadioButtons to an array
            View o = radgroup.getChildAt(i);
            if (o instanceof RadioButton) {
                listOfRadioButtons.add((RadioButton)o);
            }
        }
		
		
	
		
		
		
		
		
		
		
		
		
		
		btnContinue.setOnClickListener(new OnClickListener() { // Defines what happens when clicked on Next Question
			
			public void onClick(View v) {
				
				if(i1==1){ //If clicked the first time the text changes from Start to Next Question
					radgroup.setVisibility(View.VISIBLE);
					btnContinue.setBackgroundResource(R.drawable.nextquestion);
				}
				if(i1==length+1 && flag==true)
					{i.putExtra("finalScoreKey", total);
					startActivityForResult(i, result);
					QuizContent.this.finish();}
				if(i1==length){
					btnContinue.setBackgroundResource(R.drawable.submit);
				}
				if(i1==(length+1)){
					btnContinue.setBackgroundResource(R.drawable.viewresult);
					flag=true;//btnContinue.setText("View Final Score");
					
				}
				
				
				
				Bundle iQReceive = getIntent().getExtras();  // receives a value passed from another Activity
				if(iQReceive!=null)
				{
					check = Integer.parseInt(iQReceive.getString("stringkey2"));
					switch(check){ // depending on the value received the content changes
						case 1:   // Illuminated Chapter 1 Quiz
						length=generateQuiz(rightAnswerCSICh1, questionBankCSICh1, answerBankCSICh1);
							
							break;
							/***********************************/
						case 2:   // Illuminated Chapter 2 Quiz
							length=generateQuiz(rightAnswerCSICh2, questionBankCSICh2, answerBankCSICh2);
							
							break;
								/***********************************/
						case 3:   // Illuminated Chapter 3 Quiz
							length=generateQuiz(rightAnswerCSICh3, questionBankCSICh3, answerBankCSICh3);
							
							break;
							/***********************************/
						case 4:   // Illuminated Chapter 4 Quiz
							length=generateQuiz(rightAnswerCSICh4, questionBankCSICh4, answerBankCSICh4);
							
							break;
							/***********************************/
						case 5:   // Illuminated Chapter 5 Quiz
							length=generateQuiz(rightAnswerCSICh5, questionBankCSICh5, answerBankCSICh5);
							
							break;
							/***********************************/
						case 67:   // Illuminated Chapter 67 Quiz
							length=generateQuiz(rightAnswerCSICh67, questionBankCSICh67, answerBankCSICh67);
							
						break;
					
							/***********************************/
						case 8:   // Illuminated Chapter 8 Quiz
							length=generateQuiz(rightAnswerCSICh8, questionBankCSICh8, answerBankCSICh8);  
							
						break;
						
							/***********************************/
						case 9:   // Illuminated Chapter 9 Quiz
							length=generateQuiz(rightAnswerCSICh9, questionBankCSICh9, answerBankCSICh9);
							
						break;
						
							/***********************************/
						case 10:   // Illuminated Chapter 10 Quiz
							length=generateQuiz(rightAnswerCSICh10, questionBankCSICh10, answerBankCSICh10);
							
						break;
	
							/***********************************/
						case 13:   // Illuminated Chapter 13 Quiz
							length=generateQuiz(rightAnswerCSICh13, questionBankCSICh13, answerBankCSICh13);
							
						break;
	
	                       /***********************************/
							/***********************************/
						case 14:   // Illuminated Chapter 14 Quiz
							length=generateQuiz(rightAnswerCSICh14, questionBankCSICh14, answerBankCSICh14);
							
						break;
							/***********************************/
						case 15:   // Illuminated Chapter 15 Quiz
							length=generateQuiz(rightAnswerCSICh15, questionBankCSICh15, answerBankCSICh15);
							
						break;
							/***********************************/
						
		/********************************END OF CSILLUMINATED*****************************************/
//***************************************************************************************************************************		
						
			/********************************BEGINNING PS ALICE QUIZ*****************************************/

							case 213:   // PSAlice Chapter 1-3 Quiz
								length=generateQuiz(rightAnswerPS13, questionBankPS13, answerBankPS13);
								
							break;
								/***********************************/
							case 24:   // PSAlice Chapter 4 Quiz
								length=generateQuiz(rightAnswerPS4, questionBankPS4, answerBankPS4);   
								
							break;
									/***********************************/
							case 25:   // PSAlice Chapter 5 Quiz
								length=generateQuiz(rightAnswerPS5, questionBankPS5, answerBankPS5);     
								
							break;
										/***********************************/
							case 26:   // PSAlice Chapter 6 Quiz
								length=generateQuiz(rightAnswerPS6, questionBankPS6, answerBankPS6);   
								
							break;
								/***********************************/
							case 27:   // PSAlice Chapter 7 Quiz
								length=generateQuiz(rightAnswerPS7, questionBankPS7, answerBankPS7);  
								
							break;
								/***********************************/
							case 28:   // PSAlice Chapter 8 Quiz
								length=generateQuiz(rightAnswerPS8, questionBankPS8, answerBankPS8);    
								
							break;
								/********************************END OF PS ALICE QUIZ*****************************************/
					
							/*************BEGIN OF PROG FUNDAMENTALS**********************/
							case 314:   // Prog Fundamentals Chapter 1-4 Quiz
								length=generateQuiz(rightAnswerPF14, questionBankPF14, answerBankPF14);
								
								break;
									/***********************************/
							case 348:   // Prog Fundamentals Chapter 4-8 Quiz
								length=generateQuiz(rightAnswerPF48, questionBankPF48, answerBankPF48);
								
								break;
									/***********************************/
							case 381:   // Prog Fundamentals Chapter 8-11 Quiz
								length=generateQuiz(rightAnswerPF811, questionBankPF811, answerBankPF811);
								
								break;
									/*********************END OF PROGR FUNDAMENTALS**************/
					}
						
				}	// TODO Auto-generated method stub
				
			}
		});
		
		
		
	}
	
	public class QuizGenerator{
		
	}
         
	public int generateQuiz(int[] arrayRAnswer, String[] arrayQuestions, String[] arrayAnswers){
		if(i1>1 && a1<arrayQuestions.length){ //makes sure it doesn't return an (outofbound exeption)error msg 
			
		    rightAnswer = arrayRAnswer[a1]; //the right answer is at Index a1 of the array
		
			if(listOfRadioButtons.get(rightAnswer-1).isChecked()) // checks if the right answer is selected
			{total+=(100/arrayQuestions.length); //makes sure that whatever the number of questions, the total score is 100
			imgcheck.setBackgroundResource(R.drawable.right); 
			}//displays the message in green in case it's correct
			
			else{
				imgcheck.setBackgroundResource(R.drawable.wrong);  //displays the message in red in case it's incorrect
				
			}
		    a1++;  // increments a1
		     
		
	         }
	
	for(int i=i1; i<=arrayQuestions.length; i++){  // loop that fills the question and answers txtViews in sequence
		txtOut.setText(arrayQuestions[i-1]);  //loads a question
		
		for (int j=j1, r=1; r<=listOfRadioButtons.size(); j++, r++){ //loads 4 answers
			listOfRadioButtons.get(r-1).setText(arrayAnswers[j-1]); 
			if(r==listOfRadioButtons.size()) // if 4 answers are loaded it increments the trackers i1, j1
			{	
			    j1=j+1;  // i1 and j1 are needed to hold information used outside this loop
			    i1=i+1;    // they keep track of the last question displayed
			   
			}
		
		}
		
		break;
}
	return arrayQuestions.length;   // the method returns the length of the array (number of questions)
	}                               // which I use later to determine the behaviour of "Next" Button
}
