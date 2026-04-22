# AGENTS.md

## Project Snapshot
- Repository is currently a lightweight starter with a single tracked doc: `README.md`.
- There is no application source tree, build config, or dependency manifest yet.
- Treat this repo as process-first: workflow conventions are defined before code conventions.

## Canonical Context
- Read `README.md` first; it is currently the only project guidance.
- The "Next steps after your first push" section defines the expected development loop.

## Current Workflow (Repo-Specific)
- Verify pushes on GitHub after local commits (explicitly called out in `README.md`).
- Check/create GitHub issues before starting work to capture intent.
- Create a dedicated branch per change, then open a pull request when ready.
- Update `README.md` with newly discovered project details as work progresses.

## What To Optimize For
- Keep changes small and reviewable, because PR flow is the primary collaboration mechanism here.
- Document decisions early in `README.md` since there are no other architecture docs yet.
- Prefer incremental repository shaping (add structure + docs together) over large one-shot scaffolding.

## Architecture Reality (As Of Now)
- No defined runtime architecture exists yet (no services/modules present).
- No integration boundaries are implemented yet.
- No data flow is codified yet.
- If you introduce any of the above, document the boundary and rationale in `README.md` in the same PR.

## Build/Test/Debug Status
- No project-specific build, test, or debug commands are defined yet.
- Do not invent hidden workflows; if you add runnable code, add explicit commands to `README.md`.

## Agent Execution Checklist
- Read `README.md` and align with its GitHub-centric flow.
- Confirm work is tied to an issue (existing or newly created).
- Keep PR scope focused to one branch + one intent.
- Reflect any new structure/workflow in `README.md` before handoff.

