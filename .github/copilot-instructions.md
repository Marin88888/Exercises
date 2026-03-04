- [x] Verify that the copilot-instructions.md file in the .github directory is created. (File created 2026-03-03)

- [x] Clarify Project Requirements
	(User requested a simple Java console lesson on types and conversions.)

- [x] Scaffold the Project
	(Created src structure with placeholder Main.java and README stub.)

- [x] Customize the Project
	(Planned lesson sections and implemented Main.java walkthrough.)

- [x] Install Required Extensions
	(No extensions specified by setup info.)

- [x] Compile the Project
	(Compiled with JetBrains bundled JDK: "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2025.2.5\\jbr\\bin\\javac.exe".)

- [x] Create and Run Task
	(Not required for a single-file javac workflow.)

- [x] Launch the Project
	(Executed lesson via JetBrains runtime after user confirmation.)

- [x] Ensure Documentation is Complete
	(README.md updated with usage details and this file cleaned of HTML comments.)

## Execution Guidelines
- Track checklist progress with manage_todo_list and summarize each completion.
- Keep explanations brief and only mention skipped steps with a reason.
- Review the current todo status before starting a new task.

## Communication Rules
- Avoid verbose command output in responses.
- Skip project-structure explanations unless requested.
- State clearly when a step is skipped or blocked.

## Development Rules
- Use '.' as the working directory unless told otherwise.
- Avoid adding media or external links unless required.
- Use placeholders only when clearly labeled for later replacement.
- Use VS Code API references only for extension work.
- Never suggest reopening the project elsewhere once created.

## Folder Creation Rules
- Treat the current directory as the project root.
- Include '.' when running terminal commands that depend on cwd.
- Only create new folders when explicitly requested (except .vscode for tasks).
- If scaffolding complains about folder names, ask the user to fix and reopen.

## Extension Installation Rules
- Install only the extensions explicitly requested by get_project_setup_info.

## Project Content Rules
- Default to a Hello World when requirements are vague.
- Avoid unnecessary links or integrations.
- Do not generate media assets unless asked; label placeholders clearly.
- Ensure each component supports the requested workflow.
- Ask for clarification before adding unconfirmed features.
- Use VS Code API references only when building extensions.

## Task Completion Rules
- Finish when the project builds cleanly, documentation is current, and launch/debug instructions are provided.
- Update this plan before starting any new major task.

- Work through each checklist item systematically.
- Keep communication concise and focused.
- Follow development best practices.
